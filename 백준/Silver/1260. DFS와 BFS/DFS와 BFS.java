import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<Integer> stack;
    static Queue<Integer> queue;
    static boolean[] visited;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        stack = new Stack<>();
        queue = new LinkedList<>();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        DFS(V);
        sb.append('\n');
        visited = new boolean[N+1];
        BFS(V);

        System.out.println(sb);
    }

    static void DFS(int V){
        visited[V] = true;
        sb.append(V + " ");
        for (int i = 1; i <= N; i++) {
            if(arr[V][i] == 1 && !visited[i]){
                DFS(i);
            }
        }
    }

    static void BFS(int V){
        queue.add(V);
        visited[V] = true;
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            sb.append(tmp + " ");
            for (int i = 1; i <= N; i++) {
                if(arr[tmp][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}