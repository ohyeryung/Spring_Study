package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int distanceToRight = w-x;
        int distanceToLeft = x;
        int distanceToTop = h-y;
        int distanceToBottom = y;

        int minHorizontal = Math.min(distanceToLeft, distanceToRight);
        int minVertical = Math.min(distanceToTop, distanceToBottom);

        int min = Math.min(minHorizontal, minVertical);
        System.out.println(min);
    }
}
