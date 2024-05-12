import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine())%42;
            h.add(numbers[i]);
        }
        System.out.println(h.size());
        

    }
}