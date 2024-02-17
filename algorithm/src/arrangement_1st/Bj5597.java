package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = true;
        }

        for (int j = 1; j <= 30; j++) {
            if (!arr[j]) {
                sb.append(j).append("\n");
            }
        }
        System.out.println(sb);
    }
}
