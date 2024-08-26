
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int[] numbers = new int[1000001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i < numbers.length; i++) {

            for (int j = i+i; j < numbers.length; j+=i) {
                numbers[j] = 0;

            }
        }

        for (int i = M; i <= N; i++) {
            if(numbers[i] != 0) {
                sb.append(numbers[i]).append("\n");
            }
        }

        System.out.println(sb);

    }
}
