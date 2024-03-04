package advanced_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check()) {
                count ++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {

        int prev = 0;
        boolean[] check = new boolean[26];
        String word = br.readLine();

        for (int j = 0; j < word.length(); j++) {
            int now = word.charAt(j);
            System.out.println("now = " + now);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
