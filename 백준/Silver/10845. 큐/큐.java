
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 큐
 * 실버 4
 * 정답률 49%
 */
public class Main {
    static int[] queue = new int[10001];
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    push(x);
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);


    }

    static void push(int x) {
        queue[++rear] = x;
    }
    static int pop() {
        if(front == rear) {
            return -1;
        }
        return queue[++front];
    }

    static int size() {
        return rear - front;
    }

    static int empty() {
        if(front == rear) {
            return 1;
        }
        return 0;
    }

    static int front() {
        if(front == rear) {
            return -1;
        }
        return queue[front+1];
    }

    static int back() {
        if(rear == front) {
            return -1;
        }
        return queue[rear];
    }
}
