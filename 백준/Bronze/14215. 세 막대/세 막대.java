import java.io.*;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collection;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) {
            while (arr[2] >= arr[0] + arr[1]) {
                arr[2]--;
            }
        }
        int sum=0;
        for (int i : arr) {
            sum +=i;
        }
        System.out.println(sum);

    }
}