import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }

        int mincount = Integer.MAX_VALUE;
        int maxheight = -1;

        for (int i = min; i <= max; i++) {
            int block = B;
            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int height = arr[j][k] - i;

                    if(height > 0){
                        count += height * 2;
                        block += height;
                    }
                    else if(height < 0){
                        count += height * -1;
                        block -= height * -1;
                    }
                }
            }

            if(block >= 0){
                if(count <= mincount){
                    mincount = count;
                    maxheight = i;
                }
            }
        }
        System.out.println(mincount + " " + maxheight);
    }
}
