package numbers_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int a2 = Integer.parseInt(st1.nextToken());
        int b2 = Integer.parseInt(st1.nextToken());

        int numerator = a1*b2 + a2*b1;
        int denominator = b1*b2;

        int gcd= getGcd(numerator, denominator);

        System.out.println(numerator/gcd+" "+denominator/gcd);
    }

    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
