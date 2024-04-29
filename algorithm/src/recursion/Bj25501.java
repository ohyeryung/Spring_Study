package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25501 {
    static int res;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            res = 0;
            String s = br.readLine();
            sb.append(isPalindrome(s)).append(" ").append(res).append("\n");
        }
        System.out.println(sb);
    }
    static int isPalindrome(String str) {
        return recursion(str, 0, str.length()-1);
    }

    static int recursion(String str, int l, int r) {
        res++;
        if (l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l+1, r-1);
    }
}
