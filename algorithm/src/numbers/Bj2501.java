package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = N; i >= 1; i--) {
            if ((N%i) == 0) {
            int num = N/i;
            arr.add(num);
            }
        }
        if (arr.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(arr.get(K-1));
        }
    }
}
