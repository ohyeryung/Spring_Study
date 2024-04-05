package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int[] origin = new int[N];
        int[] sorted = new int[N];
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        int rank = 0;
        for (int v : sorted) {
            if (!indexMap.containsKey(v)) {
                indexMap.put(v, rank);
                rank++;
            }
        }
        for(int key : origin) {
            int ranking = indexMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);

    }
}
