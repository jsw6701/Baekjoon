import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        if(S + K + H >= 100){
            System.out.println("OK");
        }
        else{
            if(Math.min(Math.min(S, K), H) == S){
                System.out.println("Soongsil");
            }
            else if(Math.min(Math.min(S, K), H) == K){
                System.out.println("Korea");
            }
            else{
                System.out.println("Hanyang");
            }
        }
    }
}