import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            sb.append(H).append(" ").append(M-45);
            System.out.println(sb);
        } else {
            if (H == 0) {
                sb.append(H+24-1).append(" ").append(M+60-45);
                System.out.println(sb);
            } else {
                sb.append(H - 1).append(" ").append(M + 60 - 45);
                System.out.println(sb);
            }
        }
    }
}
