
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static LinkedList<Integer>[] list;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];

        list = new LinkedList[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            list[from].add(to);
            list[to].add(from);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }


        DFS(V);
        sb.append("\n");
        visited = new boolean[N + 1];
        BFS(V);
        System.out.println(sb);
    }

    private static void DFS(int V) {
        if(visited[V]) return;
        visited[V] = true;
        sb.append(V).append(" ");

        for (int i = 0; i < list[V].size(); i++) {
            Integer next = list[V].get(i);

            if(!visited[next]) DFS(next);
        }

    }

    private static void BFS(int V) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(V);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if(visited[poll]) continue;
            visited[poll] = true;
            sb.append(poll).append(" ");

            for (int i = 0; i < list[poll].size(); i++) {
                Integer next = list[poll].get(i);
                if(!visited[next]) queue.offer(next);
            }
        }
    }
}
