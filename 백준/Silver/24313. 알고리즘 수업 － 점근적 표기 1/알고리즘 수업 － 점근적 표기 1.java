import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int f = f(a1, a0, n);
        int g = g(c, n);
        if (f <= g && c>=a1) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }
    }

    static int f(int a1, int a0, int n) {
        return a1*n + a0;
    }
    static int g(int c, int n) {
        return c*n;
    }
}
