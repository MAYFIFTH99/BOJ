
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 중하
public class Main {

    /**
     * Key Point 배열을 1차원 배열로 상정한 후, 사다리와 뱀의 좌표를 입력받아 배열에 저장한다.
     */
    static int[] board = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 사다리
        int M = Integer.parseInt(st.nextToken()); // 뱀

        board = new int[101];
        // 1,2,3,4 .. 100 자기 인덱스 번호를 원소 값으로 우선 저장
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        // 사다리 좌표
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        // 뱀 좌표
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        /**
         * 위까지 완료하면 1~100 까지 인덱스중 사다리, 뱀 좌표를 제외한 좌표들은 본인 인덱스 값을 갖고,
         * 사다리, 뱀 좌표는 해당 좌표로 이동하도록 하는 값을 갖는다.
         */

        int minimumCountForDestination = BFS(1);
        System.out.println(minimumCountForDestination);

    }

    private static int BFS(int startPoint) {
        // 단순 방문 여부만 저장하는 것이 아닌, 해당 좌표까지의 최소 이동 횟수를 저장한다.
        int[] check = new int[101];

        // BFS를 위한 큐
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(startPoint);

        check[startPoint] = 0;

        while (true) {

            int visitedNum = queue.poll();

            // 현재 위치에서 1~6까지 주사위를 굴려 나온 수만큼 이동한다.
            for (int i = 1; i <= 6; i++) {
                int newNode = visitedNum + i;

                // 문제 조건 중 100을 넘어가는 경우는 이동하지 않는 조건 수행
                if (newNode > 100)
                    continue;

                // 방문하지 않은 좌표
                if (check[board[newNode]] == 0) {
                    queue.add(board[newNode]);
                    check[board[newNode]] = check[visitedNum] + 1;
                }

                if (board[newNode] == 100) {
                    return check[100];
                }
            }
        }
    }
}
