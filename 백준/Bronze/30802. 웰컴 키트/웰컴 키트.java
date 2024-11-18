
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 53%
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //참가자 수
        Integer N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];
        //사이즈 별 신청자 수
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        // 티셔츠와 펜의 묶음 수
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;
        // 티셔츠를 T장씩 최소 몇 묶음 주문 해야 하는지
        for (int i = 0; i < 6; i++) {
            cnt += size[i] / T;
            cnt = size[i] % T > 0 ? cnt + 1 : cnt;
        }
        System.out.println(cnt);
        // 펜을 P자루씩 최대 몇 묶음 주문 할 수 있는지,
        // 그 때 펜을 한 자루씩 몇 개 주문하는지.
        int maxOrder = N/P;
        int oneOrder = N%P;
        System.out.println(maxOrder + " " + oneOrder);
    }
}
