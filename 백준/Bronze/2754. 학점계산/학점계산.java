
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String score = sc.nextLine();
        double grade;
        if (score.equals("A+")) {
            grade = 4.3;
        }else if (score.equals("A0")) {
            grade = 4.0;
        }else if (score.equals("A-")) {
            grade = 3.7;
        }else if (score.equals("B+")) {
            grade = 3.3;
        }else if (score.equals("B0")) {
            grade = 3.0;
        }else if (score.equals("B-")) {
            grade = 2.7;
        }else if (score.equals("C+")) {
            grade = 2.3;
        }else if (score.equals("C0")) {
            grade = 2.0;
        }else if (score.equals("C-")) {
            grade = 1.7;
        }else if (score.equals("D+")) {
            grade = 1.3;
        }else if (score.equals("D0")) {
            grade = 1.0;
        } else if (score.equals("D-")) {
            grade = 0.7;
        } else {
            grade = 0.0;
        }
        System.out.println(grade);

    }
}



