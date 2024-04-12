package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            findGoldbachPartition(num);
        }
    }
    public static void findGoldbachPartition(int n) {
        boolean[] primes = new boolean[n + 1];
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        for (int p = 2; p <= n / 2; p++) {
            if (primes[p] && primes[n - p]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
