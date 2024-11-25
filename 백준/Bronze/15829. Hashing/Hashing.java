
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 브론즈 2
 * 30%
 */
public class Main {
    static int r = 31;
    static int M = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char[] charArray = str.toCharArray();
        int[] intArray = new int[len];

        for (int i = 0; i < len; i++) {
            intArray[i] = (int)charArray[i] - 96;
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += (intArray[i] * Math.pow(r, i)) % M;
        }
        System.out.println(sum);
    }
}
