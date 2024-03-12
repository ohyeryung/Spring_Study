package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = (int) (1 + Math.pow(2, N));
        int square = i*i;
        System.out.println(square);
    }

}
