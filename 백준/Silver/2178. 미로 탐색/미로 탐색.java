
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[][];
    static int[][] arr;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char[] charArray = input.toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = charArray[j] - '0';
            }
        }

        BFS(0,0);
        System.out.println(arr[N-1][M-1]);

    }
    private static void BFS(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = now[0] + dx[i];
                int newY = now[1] + dy[i];

                if (newX < 0 || newY < 0 || newX > N || newY > M || visited[newX][newY] || arr[newX][newY] == 0) {
                    continue;
                }
                queue.offer(new int[]{newX, newY});
                arr[newX][newY] = arr[now[0]][now[1]] + 1;
                visited[newX][newY] = true;
            }

        }
    }
}
