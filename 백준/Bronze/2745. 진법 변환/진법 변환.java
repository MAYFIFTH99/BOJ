import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String allLetter = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long answer = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            int index = allLetter.indexOf(c);
            answer += index * (Math.pow(B, N.length()-1 - i));
        }
        System.out.println(answer);

    }
}