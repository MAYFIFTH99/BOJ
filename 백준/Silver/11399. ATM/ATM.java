
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int[] sum = new int[N];

        sum[0] = A[0];
        for (int i =1; i < N; i++) {
            sum[i] = sum[i - 1] + A[i];
        }

        int totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += sum[i];
        }
        System.out.println(totalSum);
    }
}
