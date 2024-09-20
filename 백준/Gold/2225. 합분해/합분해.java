
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2225번 합분해
 * 골드 5
 * 44%
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N+1][K+1];


        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }
        for (int i = 0; i <= K; i++) {
            dp[1][i] = i;

        }
        for (int i = 2; i <= N; i++) {

            for (int j = 2; j <= K; j++) {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1_000_000_000;
            }
        }
        System.out.println(dp[N][K]);
    }
}
