package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int min;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                arr.add(i);
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            min = arr.get(0);
            System.out.println(min);
        }
        else {
            System.out.println(-1);
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i <=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
