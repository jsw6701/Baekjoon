import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        int T = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];

        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[A][B] = 1;
            arr[B][A] = 1;
        }

        bfs(1);

        System.out.println(count);
    }

    static void bfs(int t){
        visited[t] = true;
        for (int i = 1; i <= N; i++) {
            if(arr[t][i] == 1 && !visited[i]){
                count++;
                bfs(i);
            }
        }
    }
}