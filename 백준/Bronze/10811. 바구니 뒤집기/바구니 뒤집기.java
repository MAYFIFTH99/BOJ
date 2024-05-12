import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bascket = new int[N+1];

        for (int i = 1; i <= N; i++) {
            bascket[i] = i;
        }
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            while (i < j) {
                int temp = bascket[i];
                bascket[i] = bascket[j];
                bascket[j] = temp;

                i++;
                j--;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(bascket[i]+" ");
        }
    }
}