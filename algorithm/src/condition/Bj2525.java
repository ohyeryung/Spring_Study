package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        // 방법 1.
        int min = B + C;

        int hr;
        int hour;
        int minute;

        if (min >= 60) {
            hour = A + min/60;

        if (hour <= 24) {
            hour %= 24;
            minute = min - 60*(min/60);

            sb.append(hour).append(" ").append(minute);
            System.out.println(sb);
        }
        else {
            hr = hour - 24;
            minute = min - 60*(min/60);

            sb.append(hr).append(" ").append(minute);
            System.out.println(sb);
        }
        } else {
            sb.append(A).append(" ").append(min);
            System.out.println(sb);
        }

        // 방법 2.
        A += C/60;
        System.out.println("1. A = " + A);
        B += C%60;
        System.out.println("2. B = " + B);

        if (B >= 60) {
            A += B/60;
            System.out.println("2. A = " + A);
            B %= 60;
            System.out.println("2. B = " + B);
        }
        if (A > 23) {
            A %=24;
            System.out.println("A = " + A);
        }

        sb.append(A).append(" ").append(B);
        System.out.println(sb);

    }
}
