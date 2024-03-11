package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String number = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int res = convertBase36ToDecimal(number, b);
        System.out.println(res);
    }
        public static int convertBase36ToDecimal(String number, int b) {
            int res = 0;
            int base = 1;

            for (int i = number.length() - 1; i >= 0; i--) {
            char ch = number.charAt(i);
            int digit;
            if (Character.isDigit(ch)) {
                digit = Character.getNumericValue(ch);
            } else {
                digit = ch - 'A' + 10;
            }
            res += digit * base;
            base *= b;
        }
            return res;
    }
}
