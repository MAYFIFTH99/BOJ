
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 46% 실버 3
public class Main {
    static boolean visited[];
    static ArrayDeque<Integer>[] stack;
    static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];

        stack = new ArrayDeque[N + 1];
        for (int i = 1; i <= N; i++) {
            stack[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            stack[from].add(to);
            stack[to].add(from);
        }


        DFS(1);

        System.out.println(count);
    }
    static void DFS(int N) {
        if(visited[N]) return;
        visited[N] = true;

        while(!stack[N].isEmpty()) {
            Integer pop = stack[N].pop();
            if (!visited[pop]) {
                count++;
                DFS(pop);
            }

        }


    }
}
