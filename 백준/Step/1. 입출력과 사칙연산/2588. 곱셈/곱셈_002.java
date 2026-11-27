import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        // 1,2, 3,4,5 ,6

        /**
         * 1. (1)에 3자리를 각각 구해서, 10*n 을 한다.
         * 2. (2)에 3자리를 각각 구해서, 1.에서 구한 값과 각각 곱한 값이 순서대로 3 4 5 가 된다.
         *
         * ex) 3 4 5
         * 3를 추출하는 방법은? 10으로 한번 나눈 몫
         * 4를 추출하는 방법은? 10으로 한번 나눈 몫을 10으로 나눈 나머지 값
         * 5를 추출 하는 방법은? 10으로 나눈 나머지
         */

        int A_100 = A / 100;
        int A_10 = (A / 10) % 10;
        int A_1 = A % 10;

        int B_100 = B / 100;
        int B_10 = (B / 10) % 10;
        int B_1 = B % 10;

        System.out.println(B_1 * A);
        System.out.println(B_10 * A);
        System.out.println(B_100 * A);
        System.out.println(A * B);

        // A : 472 * B_10 = 1888
        // B_10 : 4 가 된다는 뜻.

    }
}