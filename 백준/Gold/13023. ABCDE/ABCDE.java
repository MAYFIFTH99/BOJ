
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 28%
 * 골드 5
 * ABCDE
 */
public class Main {
    static boolean result = false;
    static boolean[] visited;
    static int N;
    static LinkedList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];

        graph = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
            graph[to].add(from);
        }


        for (int i = 0; i < N; i++) {
            DFS(i, 0);
            if (result) {
                break;
            }

        }
        System.out.println(result ? 1 : 0);
    }

    static void DFS(int n, int depth) {
        if (depth == 4) {
            result = true;
            return;
        }

        visited[n] = true;

        for (int num : graph[n]) {
            if (!visited[num]) {
                DFS(num, depth + 1);
            }

        }

        visited[n] = false;
    }
}

