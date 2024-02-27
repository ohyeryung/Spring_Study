package advanced_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] com = new int[6];
        int[] res = new int[6];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            com[i] = Integer.parseInt(st.nextToken());
            if (com[i] != arr[i]) {
                res[i] = arr[i] - com[i];
            }
            sb.append(res[i]).append(" ");
        }
        System.out.println(sb);
    }
}
