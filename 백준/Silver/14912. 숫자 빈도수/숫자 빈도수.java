import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i = n; i > 0; i--){
            String num = Integer.toString(i);
            for(int j = 0; j < num.length(); j++){
                int x = num.charAt(j) - '0';
                if(x == p){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}