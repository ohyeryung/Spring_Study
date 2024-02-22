package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        st = new StringTokenizer(br.readLine(), " ");

        double max = 0, sum = 0, avg = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < N; i++) {
            sum += (arr[i]/max)*100;
            }

        avg = sum/N;

        System.out.println(avg);
    }
}
