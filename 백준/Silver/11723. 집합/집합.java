
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static LinkedList<Integer> list = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static LinkedList<Integer> allList = new LinkedList<>();
    static {
        for (int i = 1; i <= 20; i++) {
            allList.add(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        list = new LinkedList<>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    int x = Integer.parseInt(st.nextToken());
                    add(x);
                    break;
                case "remove":
                    int y = Integer.parseInt(st.nextToken());
                    remove(y);
                    break;
                case "check":
                    int z = Integer.parseInt(st.nextToken());
                    check(z);
                    break;
                case "toggle":
                    int w = Integer.parseInt(st.nextToken());
                    toggle(w);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;

            }
        }
        System.out.println(sb);

    }

    private static void all() {
        list = new LinkedList<>(allList);
    }

    private static void empty() {
        list.clear();
    }

    private static void toggle(int w) {
        if (list.contains(w)) {
            list.remove((Object) w);
        } else {
            list.add(w);
        }
    }

    private static void check(int z) {
        if (list.contains(z)) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
    }

    private static void remove(int y) {
        if (list.contains(y)) {
            list.remove((Object) y);
        }
    }

    private static void add(int x) {
        if (!list.contains(x)) {
            list.add(x);
        }
    }
}
