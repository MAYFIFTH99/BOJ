
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//62%
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] string = new String[3];

        for (int i = 0; i < 3; i++) {
            string[i] = br.readLine();
        }

        int cnt = 0;
        while (true) {
            if (string[cnt].toLowerCase().contains("fizz") || string[cnt].toLowerCase().contains("buzz")) {
                cnt++;
            } else {
                break;
            }
        }

        int num;
        if (cnt == 0) {
            num = Integer.parseInt(string[cnt]) + 3;
        } else if (cnt == 1) {
            num = Integer.parseInt(string[cnt]) + 2;
        } else {
            num = Integer.parseInt(string[cnt]) + 1;
        }

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

    }

}
