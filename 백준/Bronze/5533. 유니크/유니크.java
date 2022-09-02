import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] check = new int[101][3];
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            check[arr[i][0]][0]++;
            check[arr[i][1]][1]++;
            check[arr[i][2]][2]++;
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                if(check[arr[i][j]][j] == 1){
                    sum += arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
