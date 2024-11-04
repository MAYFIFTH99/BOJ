
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 미로 탐색
 * 44% 실버 1
 */
public class Main {
    static boolean visited[][];
    static int[][] arr;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n][m];
        arr = new int[n][m];

        // 미로 만들기
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            char[] charArray = row.toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) charArray[j] - '0';
            }
        }

        BFS(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    private static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            // 다음 이동할 수 있는 모든 경우의 수 x,y 좌표
            for (int i = 0; i < 4; i++) {
                int nX = cur[0] + dx[i];
                int nY = cur[1] + dy[i];

                if (nX >= 0 && nY >= 0 && nX < n && nY < m && !visited[nX][nY] && arr[nX][nY] != 0) {
                        visited[nX][nY] = true;
                        queue.offer(new int[]{nX, nY});
                        arr[nX][nY] = arr[cur[0]][cur[1]] + 1;

                }
            }
        }
    }


}
