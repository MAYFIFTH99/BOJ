import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double average = 0;
        double creditSum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("A+")) {
                average += 4.5 * credit;
                creditSum += credit;

            }else if (grade.equals("A0")) {
                average += 4.0 * credit;
                creditSum += credit;

            }else if (grade.equals("B+")) {
                average += 3.5 * credit;
                creditSum += credit;

            }else if (grade.equals("B0")) {
                average += 3.0 * credit;
                creditSum += credit;

            }else if (grade.equals("C+")) {
                average += 2.5 * credit;
                creditSum += credit;

            }else if (grade.equals("C0")) {
                average += 2.0 * credit;
                creditSum += credit;

            }else if (grade.equals("D+")) {
                average += 1.5 * credit;
                creditSum += credit;

            }else if (grade.equals("D0")) {
                average += credit;
                creditSum += credit;

            } else if (grade.equals("P")) {
                continue;
            } else if (grade.equals("F")) {
                average += credit*0.0;
                creditSum += credit;
            }
        }
        System.out.printf("%.6f",average / creditSum);
        
    }
}