import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //Scanner 보단 BufferedReader 가 성능이 좋다
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        //split 보단 StringTokenizer 가 성능이 좋다.
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        //Integer.valueOf 보단 parseInt 를 사용하는 것이 좋다.
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(a+b);
    }

}