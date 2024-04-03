package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            else {
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1 || !words[i].equals(words[i + 1]))
                System.out.println(words[i]);
        }
    }
}
