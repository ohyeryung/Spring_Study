package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = findNumber(N);
        System.out.println(result);
    }

    private static int findNumber(int N) {
        for (int i = 1; i <= N; i++) {
            int sum = i;
            int temp = i;

            while(temp > 0) {
                sum += temp%10;
                temp /= 10;
            }
            if (sum == N) {
                return i;
            }
        }
        return 0;
    }
}
