import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int i = 1;
        while (i < N) {
            result = bunhaesum(i);
            i++;

            if (result == N) {
                break;
            }
        }
        if (result == N) {
            System.out.println(i - 1);
        } else {
            System.out.println(0);
        }
    }

    public static int bunhaesum(int N) {


        String num = String.valueOf(N);
        for (int i = 0; i < num.length(); i++) {
            N += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return N;
    }
}
