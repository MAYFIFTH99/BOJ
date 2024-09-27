
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 절댓값 힙
 * 실버 1
 * 56%
 */
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int first_abs = Math.abs(o1);
                int second_abs = Math.abs(o2);

                if (first_abs == second_abs) {
                    return o1 > o2 ? 1 : -1;
                } else {
                    return first_abs - second_abs;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }
    }
}



/**
 *
 * 첫 번째 시도 -> 시간 초과
public class P11286_절댓값구현 {

    static LinkedList<Integer> plus = new LinkedList<>();
    static LinkedList<Integer> minus = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                find();
            } else {
                if (x > 0) {
                    plus.add(x);
                } else {
                    minus.add(Math.abs(x));
                }
            }
        }

    }

    public static void find() {
        Collections.sort(plus);
        Collections.sort(minus);

        if(plus.isEmpty() && !minus.isEmpty()) {
            System.out.println("-" + minus.removeFirst());
        }
        else if(minus.isEmpty() && !plus.isEmpty()) {
            System.out.println(plus.removeFirst());
        }else if(plus.isEmpty() && minus.isEmpty()) {
            System.out.println(0);
        }else if(!plus.isEmpty() && !minus.isEmpty()) {
            if (plus.getFirst() < minus.getFirst()) {
                System.out.println(plus.removeFirst());
            } else {
                System.out.println("-" + minus.removeFirst());
            }
        }


    }
}
 */
