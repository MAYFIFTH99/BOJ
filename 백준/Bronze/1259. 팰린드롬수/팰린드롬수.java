
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 56%
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) break;

            isPalindrom(num);
        }
    }

    private static void isPalindrom(int num) {
        String str = String.valueOf(num);
        char[] reverse = new char[str.length()];
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse[i] = str.charAt(j++);
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != reverse[i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");

    }
}
