
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//24%
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //제외할 사람의 수 : 전체 15%
        double sum=0.0, cnt = 0;
        try {
            int excludeNum = (int) Math.round(T * ((double) 15 / 100));
            for (int i = excludeNum; i < arr.length - excludeNum; i++) {
                sum += arr[i];
                cnt++;
            }
            System.out.println(Math.round((double)sum/cnt));
        }catch (Exception e){
            System.out.println(0);

        }

    }
}
