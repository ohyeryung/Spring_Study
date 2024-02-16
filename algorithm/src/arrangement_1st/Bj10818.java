package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[N];
        int index = 0;
        while (st.hasMoreTokens()) {
            numbers[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[N-1]);
    }
}
