package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrA = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            arrA.add(Integer.parseInt(st1.nextToken()));
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arrB = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            arrB.add(Integer.parseInt(st2.nextToken()));
        }
        int cnt = 0;

        Set<Integer> setA = new HashSet<>(arrA);
        Set<Integer> setB = new HashSet<>(arrB);

        Set<Integer> intersection = new HashSet<>(setA);

        intersection.retainAll(setB);
        cnt += ((setA.size() - intersection.size()) + (setB.size() - intersection.size()));

        System.out.println(cnt);
    }
}
