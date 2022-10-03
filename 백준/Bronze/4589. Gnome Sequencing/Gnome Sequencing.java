import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:").append('\n');
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            if(one - two > 0){
                if(two - three > 0){
                    sb.append("Ordered").append('\n');
                }
                else{
                    sb.append("Unordered").append('\n');
                }
            }
            else{
                if(two - three > 0){
                    sb.append("Unordered").append('\n');
                }
                else{
                    sb.append("Ordered").append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}