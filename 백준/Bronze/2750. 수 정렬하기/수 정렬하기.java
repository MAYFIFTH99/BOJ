import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static Boolean[][] WB;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[1000];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[count++] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

    }
}

