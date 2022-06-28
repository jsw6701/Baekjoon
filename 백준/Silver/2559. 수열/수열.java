import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temp = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N - K + 1];
        int cnt = 0;
        for(int i = 0; i < sum.length; i++){
             for(int j = 0; j < K; j++){
                 sum[i] += temp[j+cnt];
             }
             cnt++;
        }

        Arrays.sort(sum);

        System.out.println(sum[N-K]);
    }
}