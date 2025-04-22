import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 A의 가장 긴 증가하는 부분 수열의 길이


        // 가장 긴 증가하는 부분 수열 (여러 경우가 존재하면 아무거나 출력)

        int[] DP = new int[N];

        for (int i = 0; i < N; i++) {
            DP[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && DP[j] + 1 > DP[i]) {
                    DP[i] = DP[j] + 1;
                }
            }
        }

        int[] copiedDP = DP.clone();
        Arrays.sort(copiedDP);
        int max = copiedDP[N - 1];
        sb.append(max).append("\n");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = N-1; i >= 0; i--) {
            if (max == DP[i]) {
                stack.push(A[i]);
                max--;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb) ;
    }



}

