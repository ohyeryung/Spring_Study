package arrangement_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        System.out.println("N = " + N);
        int M = Integer.parseInt(st.nextToken());
        System.out.println("M = " + M);

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int num = Integer.parseInt(st.nextToken());
                System.out.println("num = " + num);
                arr1[j] = num;
                System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine()," ");
                int num = Integer.parseInt(st.nextToken());
                System.out.println("num = " + num);
                arr2[j] = num;
                System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
            }
        }

        for (int i = 0; i < N; i++) {
            int res = arr1[i] + arr2[i];
            sb.append(res).append(" ");
        }
        System.out.println(sb);

    }
}
