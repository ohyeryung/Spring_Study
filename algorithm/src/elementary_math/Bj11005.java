package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(convertDecimalToBaseN(n, b));
    }

    public static String convertDecimalToBaseN(int n, int b) {
        StringBuilder res = new StringBuilder();

        while (n > 0) {
            int remainder = n%b;
            char digit;

            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }
            res.insert(0, digit);
            n /= b;
        }

        return res.toString();
    }
}
