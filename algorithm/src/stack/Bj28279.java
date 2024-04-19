package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj28279 {
    static Deque<Integer> deque = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N --> 0) {
            solution(br.readLine());
        }
        br.close();
        System.out.println(sb);
    }
    static void solution(String query) {
        char cmd = query.charAt(0);

        switch (cmd) {
            case '1' : deque.offerFirst(Integer.parseInt(query.substring(2))); return;
            case '2' : deque.offerLast(Integer.parseInt(query.substring(2))); return;
            case '3' : sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n"); return;
            case '4' : sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n"); return;
            case '5' : sb.append(deque.size()).append("\n"); return;
            case '6' : sb.append(deque.isEmpty() ? 1 : 0).append("\n"); return;
            case '7' : sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n"); return;
            case '8' : sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n"); return;
            default: break;
        }
    }
}
