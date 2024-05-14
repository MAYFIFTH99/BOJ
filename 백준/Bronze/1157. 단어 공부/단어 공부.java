import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A';
            arr[num]++;
        }
        int max = 0;
        int max_index = 0;
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                max_index = j;
            }
        }for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println((char)(max_index+'A'));

        } else {
            System.out.println('?');
        }

    }
}