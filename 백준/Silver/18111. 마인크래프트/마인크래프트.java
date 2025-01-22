
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//24% 실버 2
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가로, 세로 길이와 시작 시점 인벤토리의 블록 수를 입력 받는다.
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        int[][] arr = new int[N][M];
        int min = 256; // 땅의 최고 높이
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(min > arr[i][j]) min = arr[i][j];
                if(max < arr[i][j]) max = arr[i][j];
            }
        }

        int time = 99999999;
        int high = 0;

        for (int i = min; i <= max; i++) {
            int count = 0;
            int block = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i < arr[j][k]) {
                        count += ((arr[j][k] - i) * 2);
                        block += (arr[j][k] - i );
                    }
                    else {
                        count += (i - arr[j][k]);
                        block -= (i - arr[j][k]);
                    }
                }
            }

            if (block < 0) {
                break;
            }
            if(time >= count) {
                time = count;
                high = i;
            }
        }

        System.out.println(time + " " + high);
    }

}
