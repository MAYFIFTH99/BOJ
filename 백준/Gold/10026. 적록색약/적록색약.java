
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.PolicyNode;
import java.util.Arrays;

/**
 * 56% 골드 5
 */
public class Main {
    static boolean visited[][];
    static int result[][];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] arr;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        visited = new boolean[N][N];
        result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = 0;
            }
        }


        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    DFS(new Point(i, j));
                    cnt++;
                }
            }
        }
        System.out.print(cnt+" ");


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N][N];
        cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    DFS(new Point(i, j));
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static void DFS(Point point) {
        if (visited[point.x][point.y]) return;
        visited[point.x][point.y] = true;

        char base = arr[point.x][point.y];

        for (int i = 0; i < 4; i++) {
            int newX = point.x + dx[i];
            int newY = point.y + dy[i];

            if (newX >= 0 && newY >= 00 && newX < N && newY < N && !visited[newX][newY] && arr[newX][newY] == base) {
                DFS(new Point(newX, newY));
            }
        }
    }
}
