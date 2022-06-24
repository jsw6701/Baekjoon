import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        cnt = new int[N];

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            cnt[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cnt);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch(int key){
        int low = 0;
        int high = cnt.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(key < cnt[mid]){
                high = mid - 1;
            }

            else if(key > cnt[mid]){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
