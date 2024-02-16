package arrangement_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int b = i; b <= j; b++) {
                arr[b-1] = k;
                if (arr[b-1] == 0) {
                    arr[b] = 0;
                }
            }
        }
        String response = Arrays.toString(arr);
        String repl = response.replaceAll("\\[","").replaceAll("]","");
        String res = repl.replaceAll("," ,"");
        System.out.println(res);
    }
}
