
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();


        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                setA.add(i);
            }
        }
        for (int i = 1; i <= B; i++) {
            if (B % i == 0) {
                setB.add(i);
            }
        }

        Set<Integer> interSection = new HashSet<>(setA);
        interSection.retainAll(setB);

        int greatest = interSection.stream().max(Integer::compareTo).get();

        System.out.println(greatest);

        int n = Math.min(A, B);

        while(!(n%A==0 && n%B==0)) {
            n += greatest;
        }

        System.out.println(n);
    }
}

