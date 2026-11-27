import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = A + B;
        int cha = A - B;
        int mul = A * B;
        int div = A / B;
        int mod = A % B;

        int[] result = {sum, cha, mul, div, mod};

        for (int i : result) {
            System.out.println(i);
        }
    }
}
