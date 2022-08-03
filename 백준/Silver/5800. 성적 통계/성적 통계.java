import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int j = 1; j <= K; j++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N+1];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int max = Integer.MIN_VALUE;
            for (int i = 1; i < N; i++) {
                int tmp = arr[i+1] - arr[i];
                if(max < tmp){
                    max = tmp;
                }
            }
            sb.append("Class ").append(j).append('\n');
            sb.append("Max ").append(arr[N]).append(", ").append("Min ").append(arr[1]).append(", ").append("Largest gap ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}