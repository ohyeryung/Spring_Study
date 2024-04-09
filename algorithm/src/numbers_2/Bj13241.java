package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long longA = Long.parseLong(st.nextToken());
        long longB = Long.parseLong(st.nextToken());
        long A = longA, B = longB, temp;

        while (B != 0) {
            temp = A%B;
            A = B;
            B = temp;
        }
        System.out.println(longA*longB/A);
    }
}
