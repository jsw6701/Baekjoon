import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int four = Integer.parseInt(st.nextToken());
            int sum = one + two + three + four;
            if(sum == 0){
                sb.append('D').append('\n');
            }
            else if(sum == 1){
                sb.append('C').append('\n');
            }
            else if(sum == 2){
                sb.append('B').append('\n');
            }
            else if(sum == 3){
                sb.append('A').append('\n');
            }
            else{
                sb.append('E').append('\n');
            }
        }
        System.out.println(sb);
    }
}
