import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int result = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k = 0; k < t; k++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int[][] grid = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            for(int i = 0; i < h; i++){
                String tmp = br.readLine();
                for (int j = 0; j < w; j++) {
                    grid[i][j] = tmp.charAt(j);
                    if(grid[i][j] == '.') visited[i][j] = true;
                }
            }

            System.out.println(countSheep(h, w, grid, visited));
        }


    }

    public static int countSheep(int h, int w, int[][] grid, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        int result = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(!visited[i][j]){
                    result++;

                    q.add(new int[]{j,i});
                    visited[i][j] = true;
                    while(!q.isEmpty()) {
                        int[] current = q.poll();
                        int pastX = current[0];
                        int pastY = current[1];

                        for (int k = 0; k < 4; k++) {
                            int nowX = pastX + dx[k];
                            int nowY = pastY + dy[k];

                            if (nowX < w && nowY < h && nowX >= 0 && nowY >= 0 && visited[nowY][nowX] == false) {
                                q.add(new int[]{nowX, nowY});
                                visited[nowY][nowX] = true;

                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}