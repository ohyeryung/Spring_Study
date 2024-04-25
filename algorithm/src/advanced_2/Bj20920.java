package advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        while (N --> 0) {
            String str = br.readLine();
            if (str.length() < M) continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> words = new ArrayList<>(map.keySet());

        words.sort((o1, o2) -> {
            if ((int) map.get(o1) != map.get(o2)) {
                return Integer.compare(map.get(o2), map.get(o1));
            }
            // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            // 등장 횟수와 길이가 같으면 사전 순으로 정렬
            return o1.compareTo(o2);
        });
        // 정렬된 단어들을 출력
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
