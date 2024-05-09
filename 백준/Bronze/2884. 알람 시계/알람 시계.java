import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int fixH=H, fixM=M;
        if (M >= 45) {
            fixM = M - 45;
        } else {
            fixH -=1;
            if (fixH < 0) {
                fixH = 24+fixH;
            }
            fixM = 60-(45-M);
        }

        System.out.print(fixH+" "+fixM);
    }
}