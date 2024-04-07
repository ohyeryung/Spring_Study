package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            if (Character.isDigit(str.charAt(0))) {
                int num = Integer.parseInt(str);
                sb.append(numToName.get(num)).append("\n");
            }
            else {
                sb.append(nameToNum.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
