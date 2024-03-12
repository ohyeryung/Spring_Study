package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] coins = {25, 10, 5, 1};
            int[] counts = new int[4];

            for (int j = 0; j < 4; j++) {
                counts[j] = c/coins[j];
                c %= coins[j];
            }
            sb.append(counts[0]).append(" ").append(counts[1]).append(" ").append(counts[2]).append(" ").append(counts[3]).append("\n");
        }

        System.out.println(sb);
    }
}
