package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}
