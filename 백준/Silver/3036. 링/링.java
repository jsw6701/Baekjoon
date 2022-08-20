import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        N--;

        while(N-->0){
            int nextcircle = Integer.parseInt(st.nextToken());
            int min = (first < nextcircle)? first : nextcircle;
            int gcd = 0;
            for (int i = 1; i <= min; i++) {
                if(first % i == 0 && nextcircle % i == 0){
                    gcd = i;
                }
            }
            System.out.println(first/gcd + "/" + nextcircle/gcd);
        }
    }
}