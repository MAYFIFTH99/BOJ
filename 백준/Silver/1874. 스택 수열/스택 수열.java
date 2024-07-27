
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static int last = 0;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > last) {
                for (int j = last + 1; j <= n; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last = n;
            }

            if (stack.peek() == n) {
                stack.pop();
                sb.append("-\n");
            }
        }
        if(stack.size()>0){
            bw.write("NO\n");
        }
        else {
            bw.write(sb+"\n");
        }

        bw.flush();
        bw.close();
    }
}
