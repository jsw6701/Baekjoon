import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        Long A = Long.valueOf(st.nextToken());
        Long B = Long.valueOf(st.nextToken());
        Long C = Long.valueOf(st.nextToken());

        System.out.println(A+B+C);
    }
}