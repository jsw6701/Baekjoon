import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        visited = new boolean[N][M];
        miro(0, 0);
        System.out.println(arr[N-1][M-1]);
    }
    public static void miro(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + nowX;
                int nextY = dy[i] + nowY;

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M){
                    continue;
                }
                if(visited[nextX][nextY] || arr[nextX][nextY] == 0){
                    continue;
                }

                visited[nextX][nextY] = true;
                queue.add(new int[] {nextX, nextY});
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
            }
        }
    }
}