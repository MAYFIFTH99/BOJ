
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

//22% GOLD 4
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            // 이중 우선순위 큐 역할을 할 TreeMap
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());

                char cmd = st.nextToken().charAt(0);
                int value = Integer.parseInt(st.nextToken());

                if(cmd == 'I'){
                    treeMap.put(value, treeMap.getOrDefault(value, 0) + 1);
                }
                else{
                    int n;
                    if(treeMap.isEmpty()) continue;

                    else{
                        if(value == 1){
                            n = treeMap.lastKey();
                        }
                        else{
                            n = treeMap.firstKey();
                        }

                        if(treeMap.put(n, treeMap.get(n) -1) == 1 ){
                            treeMap.remove(n);
                        }
                    }
                }
            }
            if(treeMap.isEmpty()) sb.append("EMPTY").append("\n");
            else sb.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey()).append("\n");
        }
        System.out.println(sb);
    }
}
