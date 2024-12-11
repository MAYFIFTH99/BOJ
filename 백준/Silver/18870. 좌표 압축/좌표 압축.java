
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] original = new int[N];
        int[] sorted  = new int[N];

        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            sorted[i] = original[i];
        }
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        
        for (int num : sorted) {
            if(!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : original) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());

    }


}
