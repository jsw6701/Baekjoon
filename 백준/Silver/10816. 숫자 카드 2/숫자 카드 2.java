import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] cnt = new int[20000001];

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp < 0){
                cnt[tmp * -1]++;
            }
            else if(tmp == 0){
                cnt[tmp]++;
            }
            else{
                cnt[tmp + 10000000]++;
            }

        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int tmp = Integer.parseInt(st.nextToken());

            if(tmp < 0){
                sb.append(cnt[tmp * -1] + " ");
            }
            else if(tmp == 0){
                sb.append(cnt[tmp] + " ");
            }
            else{
                sb.append(cnt[tmp + 10000000] + " ");
            }
        }

        System.out.println(sb);
    }
}