import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10926 {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String username = st.nextToken();

        if (username.length() > 50) {
            System.out.println("아이디가 조건에 맞지 않습니다.");
        }
        System.out.println(username + "??!");
    }
}
