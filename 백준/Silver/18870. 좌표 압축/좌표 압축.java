import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            arr1[i] = tmp;
            arr2[i] = tmp;
        }

        Arrays.sort(arr2);

        int rank = 0;

        for(int i = 0; i < N; i++){
            if(!rankingMap.containsKey(arr2[i])){
                rankingMap.put(arr2[i], rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int result = rankingMap.get(arr1[i]);
            sb.append(result).append(' ');
        }

        System.out.println(sb);
    }
}
