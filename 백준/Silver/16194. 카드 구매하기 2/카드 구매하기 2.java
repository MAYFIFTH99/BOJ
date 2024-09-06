
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 카드 구매하기2
 * 실버 1
 * 75%
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] P = new int[N + 1];
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            P[i] = dp[i] = num;
        }


        dp[1] = P[1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i],dp[i - j] + P[j]);
            }
        }

        System.out.println(dp[N]);

    }
}
