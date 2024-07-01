import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr = new int[10001];
    static int top=-1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num=0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ir = st.nextToken();
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (ir) {
                case "push":
                    push(num);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "top":
                    System.out.println(peek());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(isEmpty());
                    break;
                default:
                    break;
            }
        }
    }

    private static int isEmpty() {
        if (size() ==0) {
            return 1;
        }
        return 0;
    }

    private static int size() {
        return top+1;
    }

    private static int peek() {
        if (size() > 0) {
            return arr[top];
        } else {
            return -1;
        }
    }

    private static int pop() {
        if (top >= 0) {
            int oldX = arr[top];
            top--;
            return oldX;
        } else {
            return -1;
        }
    }

    public static void push(int x) {
        arr[++top] = x;
    }
}

