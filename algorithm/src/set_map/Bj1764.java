package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> listener = new HashMap<>();
        HashMap<String, Integer> viewer = new HashMap<>();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            listener.put(br.readLine(), i);
        }
        for (int i = 0; i < M; i++) {
            viewer.put(br.readLine(), i);
        }
        List<String> sortedKeys = new ArrayList<>(viewer.keySet());
        Collections.sort(sortedKeys);

        StringBuilder sb = new StringBuilder();
        for (String key : sortedKeys) {
            if (listener.containsKey(key)) {
                cnt++;
                sb.append(key).append("\n");
            }
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
