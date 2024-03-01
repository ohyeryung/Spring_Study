package advanced_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String word = s.toUpperCase();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println("ch = " + ch);
            alphabetCount[ch - 'A']++;
            System.out.println(Arrays.toString(alphabetCount));
        }

        int maxCount = 0;
        char maxChar = '?';

        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxChar = (char) ('A' + i);
            } else if (alphabetCount[i] == maxCount) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);

    }
}
