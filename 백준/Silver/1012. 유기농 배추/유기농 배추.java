import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int M;
    static int N;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            for (int j = 0; j < M; j++) {
                for (int l = 0; l < N; l++) {
                    if(arr[j][l] == 1 && !visited[j][l]){
                        check(j, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }


    static void check(int m, int n){
        visited[m][n] = true;

        for (int i = 0; i < 4; i++) {
            int x = dx[i] + m;
            int y = dy[i] + n;

            if(x >= 0 && y >= 0 && x < M && y < N){
                if(!visited[x][y] && arr[x][y] == 1){
                    check(x, y);
                }
            }
        }
    }
}