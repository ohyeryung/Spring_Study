package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String a = st.nextToken();
        String b = st.nextToken();

        for (int i = 2; i >= 0; i--) {
            sb.append(a.charAt(i));
            sb2.append(b.charAt(i));
        }

        System.out.println(Math.max(Integer.parseInt(sb.toString()), Integer.parseInt(sb2.toString())));
    }
}
