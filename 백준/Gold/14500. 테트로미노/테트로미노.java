
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//GOLD 4 36%
public class Main {

    static int max = Integer.MIN_VALUE;
    static int[][] arr;
    static boolean[][] visited;
    static int N, M;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                DFS(i, j, arr[i][j], 1);
                visited[i][j] = false;
            }
        }

        System.out.println(max);
    }

    public static void DFS(int x, int y, int sum, int depth) {
        if (depth == 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if (!visited[nx][ny]) {
                if (depth == 2) {
                    visited[nx][ny] = true;
                    DFS(x, y, sum + arr[nx][ny], depth + 1);
                    visited[nx][ny] = false;
                }
                visited[nx][ny] = true;
                DFS(nx, ny, sum + arr[nx][ny], depth + 1);
                visited[nx][ny] = false;
            }
        }

    }
}
