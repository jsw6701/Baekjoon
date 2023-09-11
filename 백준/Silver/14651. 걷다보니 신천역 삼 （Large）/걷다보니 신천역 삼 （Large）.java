import java.io.*;

public class Main {
    static int x;
    static int y;
    static long[][] d;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[n+2];

        dp[2] = 2L;

        for (int i = 3; i < n+1; i++) {
            dp[i] = (dp[i-1] * 3)%1000000009;
        }

        System.out.println(dp[n]);
    }
}