package io_calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());

        if (year > 1000 && year < 3000) {
            System.out.println(year - 543);
        }
        else {
            System.out.println("주어진 연도가 조건에 맞지 않습니다.");
        }
    }
}
