
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * 실버 4
 * 32%
 */
public class Main {
    static boolean result;
    public static void main(String[] args) throws IOException {
        /**
         * 문자인 경우 pass
         *
         * (,[ 인 경우 push
         * ),] 인 경우 pop
         * 스택이 비어있으면 yes or not no
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            ArrayDeque<Character> stack = new ArrayDeque<Character>();

            result = true;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char ch = str.charAt(i);
                switch (ch) {
                    case '(':
                    case '[':
                        stack.push(ch);
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.peek() != '(') {
                            result = false;
                            break;
                        } else {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if (stack.isEmpty() || stack.peek() != '[') {
                            result = false;
                            break;
                        }else {
                            stack.pop();
                            break;
                        }

                    default:
                        break;
                }
                if(!result) break;
            }
            if (result && stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
            result=true;
        }
    }
}
