import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//실버 4 53%
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // N개를 갖고 K원을 만족하는 최소 개수 찾기
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //어떤 자료구조에 N개의 원소를 넣을까?
        // 1. 배열

        int[] arr = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] <= K) {
                index = i;
            }
        }

        int cnt = 0;
        while (K != 0) {
            cnt += K / arr[index];
            K = K % arr[index--];
        }
        System.out.println(cnt);


    }
}
