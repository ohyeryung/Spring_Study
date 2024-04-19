package stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Bj2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayDeque<int[]> list = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int balloon = Integer.parseInt(st.nextToken());
            int[] array = {i+1, balloon};
            list.add(array);
        }

        while (list.size() > 1) {
            int[] array = list.pollFirst();
            sb.append(array[0]).append(" ");
            int n = array[1];
            if (n > 0) {
                for (int j = 1; j < n;j++) {
                    list.offerLast(list.pollFirst());
                }
            }
            else if (n < 0) {
                for (int j = n; j != 0; j++) {
                    list.offerFirst(list.pollLast());
                }
            }
        }

        sb.append(list.poll()[0]);
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}
