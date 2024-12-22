
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 실버 3 34%
public class Main {

    static int[] A;
    static int[] DP;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        DP = new int[N + 1];
        DP[0] = 0;
        if (N == 2) {
            System.out.println(A[1] + A[2]);
            return;
        }
        if (N == 1) {
            System.out.println(A[1]);
            return;
        }
        DP[1] = A[1];
        DP[2] = Math.max(A[1], A[0]) + A[2]; // A[1] + A[2]로 고정됨(계단의 점수는 자연수기 때문)

//        //Bottom Up
        if (N >= 3) {
            for (int i = 3; i <= N; i++) {
                DP[i] = Math.max(DP[i - 2], DP[i - 3] + A[i - 1]) + A[i];
            }
        }
        System.out.println(DP[N]);

//        System.out.println(find(N));
    }

    //Top Down
    static int find(int N) {
        if (DP[N] == 0 && N >= 3) {
            DP[N] = Math.max(find(N - 2), find(N - 3) + A[N - 1]) + A[N];
        }

        return DP[N];
    }
}
