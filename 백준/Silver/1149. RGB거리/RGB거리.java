import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] sum;
    static int[][] map;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        map = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sum = new int[N][3];

        for (int i = 0; i < 3; i++) {
            sum[0][i] = map[0][i];
        }


        System.out.println(Math.min(Math.min(solution(N-1, 0), solution(N-1, 1)), solution(N-1, 2)));
    }

    public static int solution(int N, int color){

        if(sum[N][color] == 0){

            if(color == 0){
                sum[N][color] = Math.min(solution(N-1, 1),  solution(N-1, 2)) + map[N][color];
            }
            else if(color == 1){
                sum[N][color] = Math.min(solution(N-1, 0),  solution(N-1, 2)) + map[N][color];
            }
            else{
                sum[N][color] = Math.min(solution(N-1, 0),  solution(N-1, 1)) + map[N][color];
            }
        }

        return sum[N][color];

    }
}