package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minCount = Math.min(minCount, countPaint(board, i, j));
            }
        }

        System.out.println(minCount);
    }

    private static int countPaint(char[][] board, int startX, int startY) {
        int count1 = 0;
        int count2 = 0;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') {
                        count1++;
                    }
                }
                else {
                    if (board[i][j] != 'B') {
                        count1++;
                    }
                }

                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'B') {
                        count2++;
                    }
                }
                else {
                    if (board[i][j] != 'W') {
                        count2++;
                    }
                }
            }
        }

        return Math.min(count1, count2);
    }
}