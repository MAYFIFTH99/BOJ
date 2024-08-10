

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            // 우선 1을 뺀 값의 연산 횟수를 정의한다.
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2]+1, dp[i]);
            } if(i%3==0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }
        }
        System.out.println(dp[N]);
    }
}

