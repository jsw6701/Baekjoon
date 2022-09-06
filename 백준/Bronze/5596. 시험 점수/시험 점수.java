import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int sum1 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int sum2 = 0;
        for (int i = 0; i < 4; i++) {
            sum2 += Integer.parseInt(st.nextToken());
        }
        if(sum1 == sum2){
            System.out.println(sum1);
        }
        else{
            System.out.println(Math.max(sum1, sum2));
        }
    }
}
