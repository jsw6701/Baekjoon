import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count0;
    static int count1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[41][2];

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for(int i = 2; i < 41; i++){
            arr[i][0] = arr[i-1][1];
            arr[i][1] = arr[i-1][1] + arr[i-1][0];
        }

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N][0]).append(' ').append(arr[N][1]).append('\n');
        }
        System.out.println(sb);
    }
}