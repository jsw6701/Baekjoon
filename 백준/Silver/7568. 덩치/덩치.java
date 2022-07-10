import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xy[i][0] = x;
            xy[i][1] = y;

        }
        
        for(int i = 0; i < N; i++){
            int rank = 1;

            for(int j = 0; j < N; j++){
                if(i == j){
                    continue;
                }
                else if(xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]){
                    rank++;
                }
            }

            System.out.println(rank);
        }
    }
}