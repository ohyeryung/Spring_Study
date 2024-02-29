package advanced_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        boolean b = true;
        for (int i = 0; i <= word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
             b = false;
             break;
            }
        }
        System.out.println( b ? 1 : 0);
    }
}
