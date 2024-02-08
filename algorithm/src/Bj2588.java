import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        System.out.println("num1 = " + num1);
        String num2 = br.readLine();
        System.out.println("num2 = " + num2);

        int a = Integer.parseInt(num2.substring(0,1));
        System.out.println("a = " + a);
        int b = Integer.parseInt(num2.substring(1,2));
        System.out.println("b = " + b);
        int c = Integer.parseInt(num2.substring(2));
        System.out.println("c = " + c);

        int first = num1 * c;
        int second = num1 * b;
        int third = num1 * a;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(first + second*10 + third*100);

    }
}
