package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = lcm(A, B);
            System.out.println(result);
        }
    }
    public static int gcd(int A, int B) {
        while (B != 0) {
            int temp = A%B;
            A = B;
            B = temp;
        }
        return A;
    }

    public static int lcm(int A, int B) {
        return A*B/gcd(A,B);
    }
}
