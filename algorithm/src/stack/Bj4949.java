package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String st = br.readLine();
            if (st.equals(".")) break;
            System.out.println(isValidSentence(st)? "yes" : "no");
        }
    }
    public static boolean isValidSentence(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
