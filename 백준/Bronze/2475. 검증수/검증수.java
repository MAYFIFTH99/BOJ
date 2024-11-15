
import java.util.Scanner;

/**
 * 75%
 */
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int first = sc.nextInt();
      int second = sc.nextInt();
      int third = sc.nextInt();
      int fourth = sc.nextInt();
      int fifth = sc.nextInt();

      int f1 = first * first;
      int f2 = second * second;
      int f3 = third * third;
      int f4 = fourth * fourth;
      int f5 = fifth * fifth;

      int sum = f1 + f2 + f3 + f4 + f5;
      int result = sum % 10;
        System.out.println(result);

    }
}
