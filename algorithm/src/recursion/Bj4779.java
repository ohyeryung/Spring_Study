package recursion;

import java.io.IOException;
import java.util.Scanner;

public class Bj4779 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = "";

        int N;
        while (sc.hasNext()) {
            N = sc.nextInt();
            for (int i = 0; i <= N; i++) {
                if (i == 0) {
                    str = "-";
                }
                else {
                    str = str + " ".repeat(str.length()) + str;
                }
            }
            System.out.println(str);
        }
    }
}
