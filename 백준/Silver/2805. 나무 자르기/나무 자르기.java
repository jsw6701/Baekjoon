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
        int[] arr = new int[N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]){
                max = arr[i];
            }
        }
        long min = 0;
        long mid = 0;

        while(min < max){

            long tmp = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < N; i++) {
                if(arr[i] > mid){
                    tmp += arr[i] - mid;
                }
            }
            if(tmp < M){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}