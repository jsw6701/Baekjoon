import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        dp = new int[30][30];
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(bridge(M, N));
        }
    }
    public static int bridge(int n, int r){
        if(dp[n][r] > 0){
            return dp[n][r];
        }
        else if(n == r || r == 0){
            return dp[n][r] = 1;
        }

        return dp[n][r] = bridge(n-1, r) + bridge(n-1, r-1);

    }
}
