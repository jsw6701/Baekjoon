import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    static int result;

    static class Bacon{
        int num;
        int cnt;

        public Bacon(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            bfs(i);
        }

        System.out.println(result);
    }

    public static void bfs(int start){
        Queue<Bacon> q = new LinkedList<>();
        visited = new boolean[n+1];
        visited[start] = true;
        int count = 0;
        q.add(new Bacon(start, 0));
        while(!q.isEmpty()){
            Bacon bacon = q.poll();
            count += bacon.cnt;

            for (int i = 1; i <= n; i++) {
                int num = map[bacon.num][i];

                if(num == 1 && !visited[i]){
                    visited[i] = true;
                    q.add(new Bacon(i, bacon.cnt + 1));
                }
            }
        }

        if(min > count){
            min = count;
            result = start;
        }
    }
}