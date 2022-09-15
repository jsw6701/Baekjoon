import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                hashSet.add(arr[i] + arr[j]);
            }
        }

        int result = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if(hashSet.contains(arr[j] - arr[i])){
                    result = Math.max(result, arr[j]);

                }
            }
        }
        System.out.println(result);
    }
}