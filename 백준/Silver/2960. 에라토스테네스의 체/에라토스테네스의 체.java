import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[1001];
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if(!visited[i]){
                for (int j = i; j <= N; j += i) {
                    if(!visited[j]){
                        count++;
                        visited[j] = true;
                    }
                    if(count == K){
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
