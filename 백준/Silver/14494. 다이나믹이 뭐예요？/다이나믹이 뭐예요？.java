import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int x;
    static int y;
    static long[][] d;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        d = new long[x+1][y+1];

        for (int i = 0; i < x+1; i++) {
            for (int j = 0; j < y+1; j++) {
                d[i][j] = -1;
            }
        }


        System.out.println(df(x, y));
    }

    public static long df(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }
        if(a == 1 && b == 1){
            return 1;
        }
        if(d[a][b] != -1) return d[a][b];

        long result = (df(a-1, b) + df(a, b-1) + df(a-1, b-1)) % 1000000007;
        d[a][b] = result;
        return result;
    }
}