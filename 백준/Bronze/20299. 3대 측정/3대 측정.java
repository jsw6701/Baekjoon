import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int count = 0;
        while(N-->0){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            boolean tf = true;
            for (int i = 0; i < 3; i++) {
                int tmp = Integer.parseInt(st.nextToken());
                arr[i] = tmp;
                if(tmp < L){
                    tf = false;
                }
                else{
                    sum += tmp;
                }
            }

            if(K <= sum && tf){
                count++;
                for (int i = 0; i < 3; i++) {
                    sb.append(arr[i] + " ");
                }

            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}