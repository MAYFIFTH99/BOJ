import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bulYear = Integer.parseInt(br.readLine());
        // 불기 연도 -> 세기 연도

        // 1988 -> 2541
        int cha = 2541 - 1998;
        System.out.println(bulYear - cha);
    }

}
