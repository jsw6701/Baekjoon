import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            sum -= Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}