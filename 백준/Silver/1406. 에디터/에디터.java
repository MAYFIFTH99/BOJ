
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기 입력 문자열 처리
        String input = br.readLine();
        for (char c : input.toCharArray()) {
            left.addLast(c);
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String instruction = br.readLine();
            StringTokenizer st = new StringTokenizer(instruction, " ");
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if (!left.isEmpty()) {
                        right.addFirst(left.removeLast());
                    }
                    break;
                case "D":
                    if (!right.isEmpty()) {
                        left.addLast(right.removeFirst());
                    }
                    break;
                case "B":
                    if (!left.isEmpty()) {
                        left.removeLast();
                    }
                    break;
                case "P":
                    char c = st.nextToken().charAt(0);
                    left.addLast(c);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : left) {
            sb.append(c);
        }
        for (char c : right) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
