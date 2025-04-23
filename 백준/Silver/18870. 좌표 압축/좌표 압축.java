
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] origin = new int[N];

        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = Arrays.copyOf(origin, origin.length);

        Arrays.sort(sorted);

        var map = new HashMap<Integer, Integer>();
        int rank = 0;

        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : origin) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb.toString().trim());

    }

}

