
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나머지
 * 브론즈 5
 * 51%
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(first(a,b,c));
        System.out.println(second(a,b,c));
        System.out.println(third(a,b,c));
        System.out.println(fourth(a,b,c));

    }

    static int first(int a, int b, int c) {
        return (a+b)%c;
    }


    static int second(int a, int b, int c) {
        return ((a%c)+(b%c))%c;
    }


    static int third(int a, int b, int c) {
        return (a*b)%c;
    }


    static int fourth(int a, int b, int c) {
        return ((a%c)*(b%c))%c;
    }
}
