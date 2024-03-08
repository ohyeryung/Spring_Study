package arrangement_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] matrix = new int[9][9];
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                matrix[i][j] = num;

                if (matrix[i][j] >= max) {
                    max = num;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);

    }
}
