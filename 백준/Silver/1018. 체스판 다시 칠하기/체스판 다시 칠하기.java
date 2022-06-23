import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] board;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        board = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                if(s.charAt(j) == 'W'){
                    board[i][j] = true;
                }
                else{
                    board[i][j] = false;
                }
            }
        }

        int len1 = N - 7;
        int len2 = M - 7;

        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                Min(i, j);
            }
        }
        System.out.println(min);
    }

    public static void Min(int x, int y){

        int count = 0;

        boolean TF = board[x][y];

        for(int i = x; i < 8+x; i++){
            for(int j = y; j < 8+y; j++){
                if(board[i][j] != TF){
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}
