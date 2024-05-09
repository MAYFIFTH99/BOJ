import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int won=0;
        if (A == B && B == C) {
            won = 10000 + 1000*A;
        } else if (A != B && A != C && B != C) {
            won = 100 * Math.max(A, Math.max(B, C));
        } else {
            if (A == B || A == C) {
                won = 1000 + 100 * A;
            } else {
                won = 1000 + 100 * B;
            }
        }

        System.out.println(won);

    }
}