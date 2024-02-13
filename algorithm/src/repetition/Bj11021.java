package repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
