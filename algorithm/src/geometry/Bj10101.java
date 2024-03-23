package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            sum += angle;
            arr[i] = angle;
        }
        if (sum != 180) {
            System.out.println("Error");
        }
        else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println("Equilateral");
        }
        else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }

    }
}
