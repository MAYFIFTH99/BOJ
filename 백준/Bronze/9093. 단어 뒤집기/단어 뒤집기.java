import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                char[] arr = st.nextToken().toCharArray();
                for (char c : arr) {
                    stack.push(c);
                }
                for (Character c : stack) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
                System.out.print(sb);
                sb.setLength(0);
            }
            System.out.println();
        }

        
        
    }
}


