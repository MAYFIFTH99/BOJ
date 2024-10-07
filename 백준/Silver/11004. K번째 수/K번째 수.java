
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(A, 0, N - 1);
        System.out.println(A[K-1]);
    }
    public static void quickSort(int A[], int start, int end) { // A[start..end]을 오름차순 정렬한다.
        //start=end가 되면 종료 - 부분배열의 크기가 1이 될 때
        if (start >= end) return;

        //분할 후 정렬
        //부분배열 정렬 종료시 start가 part가 됨
        int part = partition(A,start,end);
        quickSort(A, start, part-1); //왼쪽 영역
        quickSort(A, part, end); //오른쪽 영역
    }

    //분할한 영역 정렬
    public static int partition(int A[],int start,int end) {
        int pivot = A[(start+end)/2]; //가운데를 피벗으로

        while(start<=end) { //start==end면 부분배열 정렬 종료
            while(A[start]<pivot) start++;
            while(pivot<A[end]) end--;

            //자리 교환
            if(start<=end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                start++;
                end--;
            }
        }

        return start;

    }
}
