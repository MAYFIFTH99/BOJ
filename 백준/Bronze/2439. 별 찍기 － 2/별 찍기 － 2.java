import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// N - i 만큼 " " 출력 후 "*" * i
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = N-i; j >= 1; j--) {
                sb.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}