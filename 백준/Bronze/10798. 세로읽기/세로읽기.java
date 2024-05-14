import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] =str.charAt(j);
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                sb.append(arr[i][j]);
                bw.write(String.valueOf(arr[i][j]));
            }
        }
        bw.flush();
        bw.close();
    }
}
