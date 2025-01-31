
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] box;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];

        Queue<int[]> queue = new ArrayDeque<>();
        int unripeCount = 0;

        // 입력 받기 및 초기 익은 토마토 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                } else if (box[i][j] == 0) {
                    unripeCount++;
                }
            }
        }

        // 모든 토마토가 처음부터 익어있는 경우
        if (unripeCount == 0) {
            System.out.println(0);
            return;
        }

        // BFS 실행
        int days = bfs(queue);

        // BFS 실행 후에도 익지 않은 토마토가 남아있는 경우
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        // 최소 날짜 출력
        System.out.println(days);
    }

    private static int bfs(Queue<int[]> queue) {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int curX = cur[0];
                int curY = cur[1];

                for (int d = 0; d < 4; d++) {
                    int nextX = curX + dx[d];
                    int nextY = curY + dy[d];

                    if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                    if (box[nextX][nextY] != 0) continue; // 방문한 적 있거나, 빈 칸(-1)

                    box[nextX][nextY] = box[curX][curY] + 1;
                    queue.add(new int[]{nextX, nextY});
                }
            }
            days++;  // 하루 증가
        }

        return days;
    }
}
