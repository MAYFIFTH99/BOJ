
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int[][] arr;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int N,M;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int danji = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] != 0 && !visited[i][j]) {
                    int count = BFS(i,j,danji++);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);


        System.out.println(danji-1);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    private static int BFS(int x, int y, int danji) {
        int count = 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{x, y});
        arr[x][y] = danji;
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int oldX = poll[0];
            int oldY = poll[1];

            for (int i = 0; i < 4; i++) {
                int newX = oldX + dx[i];
                int newY = oldY + dy[i];

                if (newX >= 0 && newY >=0 && newX < N && newY < N) {
                    if (!visited[newX][newY] && arr[newX][newY] != 0) {
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                        arr[newX][newY] = danji;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
