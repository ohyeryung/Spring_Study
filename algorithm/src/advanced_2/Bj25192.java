package advanced_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Bj25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> enterMember = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N-- > 0) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                cnt += enterMember.size();
                enterMember.clear();
                continue;
            }
            enterMember.add(str);
        }
        cnt += enterMember.size();

        System.out.println(cnt);
    }
}
