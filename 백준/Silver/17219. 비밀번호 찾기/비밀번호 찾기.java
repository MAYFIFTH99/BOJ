
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 실버 4 71%
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 전체 사이트 수
        int M = Integer.parseInt(st.nextToken()); // 찾으려는 사이트 수

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String url = st.nextToken();
            String password = st.nextToken();
            map.put(url, password);
        }

        for (int i = 0; i < M; i++) {
            System.out.println(map.get(br.readLine()));

        }
    }
}
