
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//57%
public class Main {
    public static void main(String[] args) throws IOException {
        // a층 b호에 살려면,
        // a-1층에 1~b호 사람들의 합만큼 거주

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] house = new int[15][15];

        for (int i = 1; i < 15; i++) {
            house[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                for (int k = 1; k <=j; k++) {
                    house[i][j] += house[i-1][k];
                }
            }
        }



        for (int i = 0; i < T; i++) {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            System.out.println(house[x][y]);
        }
    }
}
