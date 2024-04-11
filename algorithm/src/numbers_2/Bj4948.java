package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int cnt = 0;
            for (int i = n+1; i <= 2*n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i*i <= num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
