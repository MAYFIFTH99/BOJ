
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * 데크
 * 실버 4
 * 정답률 56%
 */
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push_back":
                    int x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;

                case "push_front":
                    int y = Integer.parseInt(st.nextToken());
                    deque.addFirst(y);
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    Integer removed = deque.removeLast();
                    sb.append(removed).append("\n");
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    Integer removed1 = deque.removeFirst();
                    sb.append(removed1).append("\n");
                    break;

                case "size":
                    int size = deque.size();
                    sb.append(size).append("\n");
                    break;

                case "empty":
                    boolean empty = deque.isEmpty();
                    if (empty) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    Integer peekFirst = deque.peekFirst();
                    sb.append(peekFirst).append("\n");
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    Integer peekLast = deque.peekLast();
                    sb.append(peekLast).append("\n");
                    break;
            }
        }
        System.out.println(sb);



    }
}
