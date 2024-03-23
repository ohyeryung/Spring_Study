package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int Xmax = Integer.MIN_VALUE, Xmin = Integer.MAX_VALUE, Ymax = Integer.MIN_VALUE, Ymin = Integer.MAX_VALUE;
        int[] Xlist = new int[N];
        int[] Ylist = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            Xlist[i] = X;
            Ylist[i] = Y;
            Xmax = Math.max(X, Xmax);
            Xmin = Math.min(X, Xmin);
            Ymax = Math.max(Y, Ymax);
            Ymin = Math.min(Y, Ymin);
        }
        System.out.println((Xmax-Xmin)*(Ymax-Ymin));
    }
}
