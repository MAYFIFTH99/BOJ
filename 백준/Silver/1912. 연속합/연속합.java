
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 연속합 1912번
 * 실버 2
 * 37%
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = seq[0];
        for (int i = 1; i < n; i++) {
            dp[i] = seq[i];
            dp[i] = Math.max(dp[i], dp[i - 1] + dp[i]);
        }

        Arrays.sort(dp);
        System.out.println(dp[n - 1]);
    }
}
