package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int q, d, n, p;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());

            q = c/25;
            c -= q*25;
            d = c/10;
            c -= d*10;
            n = c/5;
            c -= n*5;
            p = c;
            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append("\n");
        }

        System.out.println(sb);
    }
}
