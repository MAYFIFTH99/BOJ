import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bfr.readLine());
        int cnt=0;

        StringTokenizer st = new StringTokenizer(bfr.readLine());
        while (st.hasMoreTokens()) {
            cnt += checkPrime(Integer.parseInt(st.nextToken()));
        }
        System.out.println(cnt);
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
        return 1;
    }
}
