import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bfr.readLine());
        int i=2;

        while (true) {
            if (N < 2) {
                break;
            }
            if (N % i == 0) {
                System.out.println(i);
                N = N/i;
            } else {
                i++;
            }
        }

    }
}
