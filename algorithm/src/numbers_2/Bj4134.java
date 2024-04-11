package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N <= 2) {
                System.out.println(2);
                continue;
            }

            while (true) {
                boolean flag = true;

                for (int j = 2; j < Math.sqrt(N) + 1; j++) {
                    if (N%j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println(N);
                    break;
                }
                N++;
            }
        }
    }
}
