package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] compare = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            compare[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] origin = new int[M];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            origin[i] = Integer.parseInt(st1.nextToken());
        }
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : compare) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : origin) {
            sb.append(countMap.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
