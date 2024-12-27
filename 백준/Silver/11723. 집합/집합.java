import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String inst = st.nextToken();
            switch (inst) {
                case "add":
                    int x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                case "remove":
                    int y = Integer.parseInt(st.nextToken());
                    try {
                        set.remove(y);
                    } catch (Exception e) {
                        break;
                    }
                    break;
                case "check":
                    int z = Integer.parseInt(st.nextToken());
                    if (set.contains(z)) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle":
                    int k = Integer.parseInt(st.nextToken());
                    if (set.contains(k)) {
                        set.remove(k);
                    } else {
                        set.add(k);
                    }

                    break;

                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);

    }
}
