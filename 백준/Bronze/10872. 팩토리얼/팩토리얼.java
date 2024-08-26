
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 수학300
 * 팩토리얼
 * 브3
 * 55%
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[13];
        array[0] = array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] * i;
        }
        System.out.println(array[N]);


    }
}
