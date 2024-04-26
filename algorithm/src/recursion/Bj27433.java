package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        System.out.println(factorial(N));

    }
    static long factorial(long N) {
        if (N <= 1)	{
            return 1;
        }
        return N * factorial(N - 1);
    }
}
