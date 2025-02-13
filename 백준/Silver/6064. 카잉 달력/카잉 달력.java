
import java.util.Scanner;

// 27% Silver 1
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Test Case Count

        for (int tc = 1; tc <= T; tc++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int lcm = M * N / gcd(M, N);
            int n = 0;
            int ans = -1;
            while(n * M < lcm){
                if((n * M + x - y) % N == 0){
                    ans = n * M + x;
                    break;
                }
                n++;
            }
            System.out.println(ans);
        }
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

}

/**
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in); int T =
 * sc.nextInt(); // Test Case Count
 * <p>
 * for (int s = 0; s < T; s++) { // T번 만큼 boolean check = false; int m = sc.nextInt(); int n =
 * sc.nextInt(); int x = sc.nextInt() - 1; int y = sc.nextInt() - 1;
 * <p>
 * for (int i = x; i < (n * m); i += m) { if (i % n == y) { System.out.println(i + 1); check = true;
 * break; } } if(!check){ System.out.println(-1); }
 * <p>
 * } }
 */
