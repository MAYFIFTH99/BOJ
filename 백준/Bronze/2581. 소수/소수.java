import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[10000];
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bfr.readLine());
        int N = Integer.parseInt(bfr.readLine());
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum += checkPrime(i);
        }
        if (sum == 0) {
            System.out.println(-1);

        } else {
            System.out.println(sum);
            System.out.println(arr[0]);
        }
    }

    static int checkPrime(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        arr[count++] = n;

        return n;
    }
}
