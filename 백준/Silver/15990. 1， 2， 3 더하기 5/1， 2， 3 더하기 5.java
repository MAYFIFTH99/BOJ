
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1,2,3 더하기 5
 * 실버 2
 * 31%
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        final int MOD = 1_000_000_009;
        long[][] dp = new long[100_001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int j = 4 ; j <= 100_000; j++) {
            dp[j][1] = (dp[j - 1][2] + dp[j - 1][3]) % MOD;
            dp[j][2] = (dp[j - 2][1] + dp[j - 2][3]) % MOD;
            dp[j][3] = (dp[j - 3][1] + dp[j - 3][2]) % MOD;
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append((dp[n][1] + dp[n][2] + dp[n][3]) % MOD).append("\n");
        }

        System.out.println(sb);
    }
}
