import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] arr;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        int count = 0;

        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            u--;
            v--;
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                checked(i);
                count++;
            }
        }

        System.out.println(count);
    }
    public static void checked(int start){
        visited[start] = true;
        for (int i = 0; i < N; i++) {
            if(arr[start][i] == 1 && !visited[i]){
                checked(i);
            }
        }
    }
}