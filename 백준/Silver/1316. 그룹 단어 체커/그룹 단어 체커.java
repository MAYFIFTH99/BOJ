import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (String s : arr) {
            char[] word = s.toCharArray();
            if (checkGroup(word)) {
                count += 1;
            }
        }
        System.out.println(N - count);
    }

    static Boolean checkGroup(char[] word) {
        for (int i = 0; i < word.length-1; i++) {
            for (int j = i+1; j < word.length; j++) {
                if (word[i] != word[j]) {
                    for (int k = j; k < word.length; k++) {
                        if (word[i] == word[k]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}