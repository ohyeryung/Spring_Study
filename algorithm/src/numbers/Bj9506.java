package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            for (int i = N/2; i > 0; i--) {
                if (N % i == 0) {
                    arr.add(i);
                    sum += i;
                }
            }
            if (sum == N) {
                sb.append(N).append(" = ");
                for (int j = arr.size() - 1; j >= 0; j--) {
                    sb.append(arr.get(j));
                    if (j > 0) {
                        sb.append(" + ");
                    }
                }

                System.out.println(sb);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
            sb.setLength(0);
        }
    }
}
