package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj18258 {
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N --> 0) {
            solution(br.readLine());
        }
        System.out.println(sb);
    }

    static void solution(String query) {
        String[] parts = query.split(" ");
        String cmd = parts[0];

        switch (cmd) {
            case "push":
                queue.offer(Integer.parseInt(parts[1])); return;
            case "front": sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n"); return;
            case "back": sb.append(queue.isEmpty() ? -1 : peekLast(queue)).append("\n"); return;
            case "size": sb.append(queue.size()).append("\n"); return;
            case "empty": sb.append(queue.isEmpty() ? 1 : 0).append("\n"); return;
            case "pop": sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n"); return;
            default : break;
        }
    }
    public static int peekLast(Queue<Integer> queue) {
        if (queue.isEmpty()) return -1;
        return ((LinkedList<Integer>) queue).peekLast();
    }
}
