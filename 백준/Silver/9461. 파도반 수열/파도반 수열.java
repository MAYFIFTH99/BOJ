import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 실버 3 44%
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] DP = new long[100 + 1];
        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 1;
        DP[3] = 1;

        for (int i = 4; i <= 100; i++) {
            DP[i] = DP[i - 3] + DP[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(DP[N]);
        }
    }
}
