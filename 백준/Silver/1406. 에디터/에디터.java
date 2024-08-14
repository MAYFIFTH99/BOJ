import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int countInstruct = Integer.parseInt(br.readLine());

        StringTokenizer st;

        ArrayDeque<Character> leftQueue = new ArrayDeque<>();
        ArrayDeque<Character> rightQueue = new ArrayDeque<>();

        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            leftQueue.offer(c);
        }

        for (int i = 0; i < countInstruct; i++) {
            st = new StringTokenizer(br.readLine());
            String instruction = st.nextToken();
            switch (instruction) {
                case "P":
                    String x = st.nextToken();
                    leftQueue.offerLast(x.charAt(0));
                    break;
                case "L":
                    if(!leftQueue.isEmpty()){
                        rightQueue.offerFirst(leftQueue.pollLast());
                    }
                    break;
                case "D":
                    if(!rightQueue.isEmpty()){
                        leftQueue.offerLast(rightQueue.pollFirst());
                    }
                    break;
                case "B":
                    if(!leftQueue.isEmpty()){
                        leftQueue.pollLast();
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : leftQueue) {
            sb.append(c);
        }
        for (Character c : rightQueue) {
            sb.append(c);
        }
        System.out.println(sb);

    }
}
