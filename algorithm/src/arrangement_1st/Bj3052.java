package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int[] compare = new int[42];
        int remainder = 0, count = 0;

        Arrays.fill(compare, 0);

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            remainder = arr[i]%42;
            compare[remainder] = remainder + 1;

        }
        for (int j : compare) {
            if (j != 0) count++;
        }
        br.close();
        System.out.println(count);
    }
}
