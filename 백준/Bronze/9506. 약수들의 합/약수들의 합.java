import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int isLast;
        while (true) {
            int T = Integer.parseInt(bfr.readLine());
            if (T == -1) {
                break;
            }
            completeNum(T);

        }
    }

    static void completeNum(int n) {
        int sum = 0;
        int[] arr = new int[1000];
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                arr[cnt++] = i;
            }
        }
        if (sum == n) {
            System.out.print(n + " = ");
            for (int j = 0; j < cnt - 1; j++) {
                System.out.print(arr[j] + " + ");
            }
            System.out.println(arr[cnt - 1]);
        } else {
            System.out.printf("%d is NOT perfect.\n",n);
        }
    }
}
