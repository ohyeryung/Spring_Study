package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }
    static int fibonacci(int N) {
        if (N < 2)
            return N;
        return fibonacci(N-1) + fibonacci(N-2);
    }
}
