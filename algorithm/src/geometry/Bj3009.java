package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr1[i] = x;
            arr2[i] = y;
        }
        int xResult = findMissingNumber(arr1);
        int yResult = findMissingNumber(arr2);

        System.out.println(xResult + " " + yResult);
    }

    private static int findMissingNumber(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        } else if (arr[0] == arr[2]) {
            return arr[1];
        } else {
            return arr[0];
        }
    }
}
