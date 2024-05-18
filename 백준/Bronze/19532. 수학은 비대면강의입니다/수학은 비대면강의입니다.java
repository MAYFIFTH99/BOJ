import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int[] result = pairEqualtion(a,b,c,d,e,f);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] pairEqualtion(int a, int b, int c, int d, int e, int f) {
        int[] arr = new int[2];

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    arr[0] = x;
                    arr[1] = y;
                }
            }
        }
        return arr;
    }
}
