package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int time = 0;

        for (int i = 0; i < s.length(); i++) {
            char dial = s.charAt(i);
            if (dial == 'A' || dial == 'B' || dial == 'C') {
                time += 3;
            }
            else if (dial == 'D' || dial == 'E' || dial == 'F') {
                time += 4;
            }
            else if (dial == 'G' || dial == 'H' || dial == 'I') {
                time += 5;
            }
            else if (dial == 'J' || dial == 'K' || dial == 'L') {
                time += 6;
            }
            else if (dial == 'M' || dial == 'N' || dial == 'O') {
                time += 7;
            }
            else if (dial == 'P' || dial == 'Q' || dial == 'R' || dial == 'S') {
                time += 8;
            }
            else if (dial == 'T' || dial == 'U' || dial == 'V') {
                time += 9;
            }
            else if (dial == 'W' || dial == 'X' || dial == 'Y' || dial == 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
