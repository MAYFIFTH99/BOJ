
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 29% Silver1
public class Main {
    static StringBuilder sb;
    static String P;
    static String S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        S = br.readLine();

        sb.append("I");
        for (int i = 1; i <= N; i++) {
            sb.append("OI");
        }

        P = sb.toString().trim();

        int start = 0;
        int end = P.length() - 1;
        int count = 0;
        while (start <= S.length() - sb.length()) {

            if (extractStr(start, end)) {
                count++;
            }
            start++;
            end++;
        }

        System.out.println(count);



    }

    private static boolean extractStr(int start, int end) {
        return S.substring(start, end+1).equals(P);
    }

}
