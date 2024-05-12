import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] subjects = new double [1000];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            subjects[i] = Integer.parseInt(st.nextToken());
        }

        double max = 0.0;
        for (double subject : subjects) {
            if (subject > max) {
                max = subject;
            }
        }

        double sum = 0;
        for (double subject : subjects) {
            subject = subject / max * 100;
            sum += subject;
        }
        System.out.println(sum / (double) N);
    }
}