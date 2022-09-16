import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Long> hashMap = new HashMap<>();
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
            if(arr[i] == K) sum++;
            if(hashMap.containsKey(arr[i]-K)) sum += hashMap.get(arr[i]-K);
            if(!hashMap.containsKey(arr[i])) hashMap.put(arr[i], 1L);
            else hashMap.put(arr[i], hashMap.get(arr[i])+1);
        }
        System.out.println(sum);
    }
}
