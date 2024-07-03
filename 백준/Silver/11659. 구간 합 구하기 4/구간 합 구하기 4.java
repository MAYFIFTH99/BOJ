
import java.util.Scanner;

public class Main {
    // 구간 합 구하기
    // 실버3 11659번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] newNumbers = sectionSum(numbers, N);
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            // A 부터 B까지의 구간 합
            if (A == 1) {
                System.out.println(newNumbers[B - 1]);
            } else {

                System.out.println(newNumbers[B-1] - newNumbers[A-2]);
            }

        }
    }

    public static int[] sectionSum(int[] arr, int N) {
        int[] sectionSum = new int[N];
        sectionSum[0] = arr[0];
        for (int i = 1; i < sectionSum.length; i++) {
            sectionSum[i] = sectionSum[i-1] + arr[i];
        }

        return sectionSum;
    }
}
