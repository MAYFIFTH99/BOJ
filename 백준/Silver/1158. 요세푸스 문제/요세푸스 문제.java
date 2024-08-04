

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제
 * 실버 4
 * 정답률 49%
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while(!circle.isEmpty()) {
            index = (index+K-1) % circle.size();
            Integer remove = circle.remove(index);
            sb.append(remove);
            if (!circle.isEmpty()) {
                sb.append(", ");
            }
            }
        sb.append(">");
        System.out.println(sb);
        }


    }

