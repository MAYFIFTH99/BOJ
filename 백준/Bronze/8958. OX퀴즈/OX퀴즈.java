
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int testCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCount; i++) {
            String test = sc.nextLine();
            int sum = getSum(test);
            sb.append(sum).append("\n");
        }

        System.out.println(sb);

    }

    private static int getSum(String test) {
        int sum = 0;
        String[] correct = test.split("X");
        ArrayList<String> correctArr = new ArrayList<String>();
        for (String s : correct) {
            if (!s.isEmpty()) {
                correctArr.add(s);
            }
        }

        for (String s : correctArr) {
            int length = s.length();
            for (int i = 1; i <= length; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
