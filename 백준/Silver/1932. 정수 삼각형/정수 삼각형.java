import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] map;
    static Integer[][] sum;

    static int n;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String s;
        map = new Integer[n][n];
        sum = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);

            for (int j = 0; j < i+1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            sum[n-1][i] = map[n-1][i];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(solution(0, 0));
    }

    public static int solution(int depth, int l){

        if(depth == n-1) return sum[depth][l];

        if(sum[depth][l] == null){
            sum[depth][l] = Math.max(solution(depth+1, l), solution(depth+1, l+1)) + map[depth][l];
        }

        return sum[depth][l];
    }
}