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

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < N-1; i++) {
            int tmp = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tmp += Math.abs(arr[j] - Integer.parseInt(st.nextToken()));
            }
            if(tmp > 2000){
                count++;
            }
        }

        if(N/2 > count){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}