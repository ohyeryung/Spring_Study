import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N/4; i++) {
            sb.append("long").append(" ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
