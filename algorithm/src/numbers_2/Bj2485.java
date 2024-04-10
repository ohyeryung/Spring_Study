package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] intervals = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            intervals[i] = arr[i + 1] - arr[i];
        }

        int gcd = calculateGCD(intervals);

        int minTrees = 0;
        for (int interval : intervals) {
            minTrees += interval / gcd - 1;
        }

        System.out.println(minTrees);
    }

    private static int calculateGCD(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = gcd(gcd, numbers[i]);
        }
        return gcd;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
