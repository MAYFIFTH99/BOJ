
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static LinkedList<Integer>[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        // 연결 리스트를 원소로 갖는 배열 생성
        array = new LinkedList[N + 1];
        for (int i = 1; i <= N; i++) {
            array[i] = new LinkedList<>();
        }


        // 그래프 생성
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            array[from].add(to);
            array[to].add(from);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(array[i]);
        }



        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);

    }

    //DFS
    private static void DFS(int n) {
        if(visited[n]) return;
        visited[n] = true;
        System.out.print(n+" ");
        for ( int num : array[n]) {
            if (!visited[num]) {
                DFS(num);
            }
        }



    }

    private static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n); // add
        visited[n] = true;

        while(!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " ");
            for ( int num : array[poll]) {
                if (!visited[num]) {
                    visited[num] = true;
                    queue.offer(num);
                }
            }
        }
    }

}
