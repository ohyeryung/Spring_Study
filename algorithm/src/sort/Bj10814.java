package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Bj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            arr[i][0] = st[0];
            arr[i][1] = st[1];

        }
        Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        for (int i = 0 ;i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
