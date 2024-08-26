import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        // 팩토리얼 계산을 위한 BigInteger
        BigInteger factorial = BigInteger.ONE;

        // 팩토리얼 계산 (1부터 N까지 곱함)
        for (int i = 2; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // StringBuilder에 팩토리얼 값 저장 후 뒤집기
        StringBuilder sb = new StringBuilder(factorial.toString()).reverse();

        // 끝에서부터 0의 개수를 셈
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
