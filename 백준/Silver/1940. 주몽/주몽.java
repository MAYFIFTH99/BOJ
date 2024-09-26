
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 1940번
 * 실버4
 * 47%
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = N - 1;
        int sum = 0;
        int count = 0;

        Arrays.sort(A);

        while (i < j) {
            sum = A[i] + A[j];
            if (sum < M) {
                i++;
            } else if (sum > M) {
                j--;
            } else {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
