import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static char[] str1;
    static char[] str2;
    static int[][] dp;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();

        dp = new int[str1.length+1][str2.length+1];

        LCS(str1.length, str2.length);

        backtracking(str1.length, str2.length);

        System.out.println(sb);
    }

    public static void LCS(int x, int y){
        for(int i = 1; i <= str1.length; i++){
            for(int j = 1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        sb.append(dp[x][y] + "\n");
    }

    public static void backtracking(int x, int y){
        Stack<Character> stack = new Stack<>();
        while(x > 0 && y > 0){
            if(x == 0 || y == 0) break;

            if(dp[x][y] == dp[x-1][y]){
                x--;
            }
            else if(dp[x][y] == dp[x][y-1]){
                y--;
            }
            else{
                stack.push(str1[x-1]);
                x--;
                y--;
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
    }
}
