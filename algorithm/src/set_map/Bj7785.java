package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        TreeMap<String, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String status = st.nextToken();
            treeMap.put(name, status);
        }
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            if (entry.getValue().equals("enter")) {
                sb.append(entry.getKey()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
