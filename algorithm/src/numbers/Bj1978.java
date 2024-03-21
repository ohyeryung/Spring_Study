package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            int num = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= num; j++) {
                if (num%j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
