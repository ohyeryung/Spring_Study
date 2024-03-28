package arrangement_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Character[][] matrix = new Character[15][15];
        StringBuilder sb = new StringBuilder();

        char ch;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), "");
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                ch = str.charAt(j);
                matrix[i][j] = ch;
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            for (Character[] characters : matrix) {
                if (characters[j] != null) {
                    sb.append(characters[j]);
                }
            }
        }
        System.out.print(sb);
    }
}
