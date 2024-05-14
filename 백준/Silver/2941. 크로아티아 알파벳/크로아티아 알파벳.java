import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String croa = br.readLine();

        if (croa.contains("lj")) {
            croa = croa.replace("lj", "?");
        } if (croa.contains("c=")) {
            croa = croa.replace("c=","?");
        }
         if (croa.contains("c-")) {
            croa = croa.replace("c-","?");
        } if (croa.contains("dz=")) {
            croa = croa.replace("dz=","?");
        } if (croa.contains("d-")) {
            croa = croa.replace("d-","?");
        }
         if (croa.contains("nj")) {
            croa = croa.replace("nj","?");
        }
         if (croa.contains("s=")) {
            croa = croa.replace("s=","?");
        }
         if (croa.contains("z=")) {
            croa = croa.replace("z=","?");
        }
        System.out.println(croa.length());

    }
}