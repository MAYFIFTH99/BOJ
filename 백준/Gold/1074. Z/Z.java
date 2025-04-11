import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);

        find(size, r, c);
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {

        if(size == 1) return;

        int newSize = size / 2;

        // Left upper quadrant
        if (r < newSize && c < newSize) {
            find(newSize, r, c);
        }
        // Right upper quadrant
        else if (r < newSize && c >= newSize) {
            count += newSize * newSize;
            find(newSize, r, c - newSize);
        }
        // Left lower quadrant
        else if (r >= newSize && c < newSize) {
            count += 2 * newSize * newSize;
            find(newSize, r - newSize, c);
        }
        // Right lower quadrant
        else {
            count += 3 * newSize * newSize;
            find(newSize, r - newSize, c - newSize);
        }
    }
}
