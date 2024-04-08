package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bj11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }
        cnt += substrings.size();
        System.out.println(cnt);
    }
}
