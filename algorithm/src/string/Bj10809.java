package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int j : alphabet) {
            System.out.print(j + " ");
        }
    }
}
