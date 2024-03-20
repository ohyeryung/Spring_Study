package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int line = 1;
        int count = 1;
        while (x > count) {
            line++;
            count += line;
        }

        int diff = count - x;
        int numerator, denominator;
        if (line%2 == 0) {
            numerator = line - diff;
            denominator = diff + 1;
        } else {
            numerator = diff + 1;
            denominator = line - diff;
        }
        System.out.println(numerator + "/" + denominator);
    }
}
