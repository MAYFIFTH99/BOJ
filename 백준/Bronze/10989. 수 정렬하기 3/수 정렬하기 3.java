
import java.io.*;

/**
 * 계수, 기수 정렬 사용해보기
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[10001];

        for (int i = 0; i < N; i++) {
            A[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < A.length; i++) {
            while (A[i] > 0) {
                sb.append(i).append("\n");
                A[i]--;
            }
        }
        System.out.println(sb);
    }
}



/**
 * 기수 정렬
 * public static void radixSort(int len) {
 *         Queue<Integer>[] bucket = new LinkedList[BUCKET_SIZE];
 *         for(int i=0; i<BUCKET_SIZE; i++) {
 *             bucket[i] = new LinkedList<>();
 *         }
 *
 *         // 정렬할 자릿수의 크기 만큼 반복한다.
 *         // 현재 배열의 가장 큰 수는 10의 자리이므로, 2번 반복하게 한다.
 *         int m = 1;
 *         for(int d=0; d<2; d++) {
 *             for(int i=0; i<len; i++) {
 *                 bucket[(A[i]/m)%10].add(A[i]);
 *             }
 *
 *             for(int i=0, j=0; i<BUCKET_SIZE; i++) {
 *                 while(!bucket[i].isEmpty()) {
 *                     A[j++] = bucket[i].poll();
 *                 }
 *             }
 *             m *= 10;
 *         }
 *     }
 */