import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", N, i, N * i);
            System.out.println();
        }
    }
}