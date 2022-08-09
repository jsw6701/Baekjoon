import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] F = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            int score = Integer.parseInt(br.readLine());
            F[i] = score;
        }

        if(N == 1){
            dp[1] = F[1];
        }
        else if (N == 2){
            dp[2] = Math.max(F[2], F[1] + F[2]);
        }
        else{
            dp[1] = F[1];
            dp[2] = Math.max(F[2], F[1] + F[2]);

            for (int i = 3; i <= N; i++) {
                dp[i] = Math.max(dp[i-3] + F[i-1] + F[i], dp[i-2] + F[i]);
            }
        }
        System.out.println(dp[N]);
    }
}