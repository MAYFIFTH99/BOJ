
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

// 26% 실버1
public class Main {

    static int[] check = new int[100001];
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }
        BFS(N);
    }

    private static void BFS(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < 3; i++) {
                int newX;

                if (i == 0) {
                    newX = temp - 1;
                } else if (i == 1) {
                    newX = temp + 1;
                } else {
                    newX = temp * 2;
                }

                if (newX == K) {
                    System.out.println(check[temp] + 1);
                    return;
                }

                if (newX >= 0 && newX < check.length && check[newX] == 0) {
                    
                    queue.offer(newX);
                    check[newX] = check[temp] + 1;
                }

            }

        }
    }
}
