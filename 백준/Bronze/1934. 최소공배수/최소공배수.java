import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int min = (A > B)? A : B;
            int tmp = 0;
            for (int i = 1; i <= min; i++) {
                if(A % i == 0 && B % i == 0){
                    tmp = i;
                }
            }
            System.out.println(A * B / tmp);
        }
    }
}
