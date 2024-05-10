import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N 을 4로 나눈다.
        // 값이 0인경우 몫 or 값이 0이 아닌경우 몫 + 1 만큼의 long이 필요하다.

        int divideN = N / 4;
        int restN = N % 4;
        for (int i = 0; i < divideN; i++) {
            System.out.print("long ");
        }
        if (restN != 0) {
            System.out.print("long int");
        } else {
            System.out.print("int");
        }





    }
}