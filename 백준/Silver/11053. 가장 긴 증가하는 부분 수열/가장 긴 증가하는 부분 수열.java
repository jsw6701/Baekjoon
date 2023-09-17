import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] num;
    static int[] dp;
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            findLength(i);
        }

        int max = dp[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

    public static int findLength(int depth){

        if(dp[depth] == 0){
            dp[depth] = 1;

            for (int i = depth - 1; i >= 0; i--) {
                if(num[depth] > num[i]){
                    dp[depth] = Math.max(dp[depth], findLength(i)+1);
                }
            }
        }
        
        return dp[depth];
    }
}