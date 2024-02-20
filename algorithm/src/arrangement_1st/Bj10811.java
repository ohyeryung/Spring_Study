package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int i,j;
        int[] arr = new int[N];

        for (int n = 1; n <= N; n++) {
            arr[n - 1] = n;
        }

        for (int a = 1; a <= M; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            while(i<j) {
                int temp = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = temp;
                i++;
                j--;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
