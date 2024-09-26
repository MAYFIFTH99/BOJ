
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 실버 5
 * 48%
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int start = 1;
        int end = 1;

        int sum = 1;
        while (end != N) {
            if (sum < N) {
                end++;
                sum += end;
            } else if (sum > N) {
                sum = sum - start;
                start++;
            } else if (sum == N) {
                count++;
                sum-= start;
                start++;
            }
        }
        System.out.println(count);
        


    }
}
