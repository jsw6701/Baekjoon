import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                st.nextToken();
                String key = st.nextToken();

                if(map.containsKey(key)){
                    int value = map.get(key);
                    map.put(key, ++value);
                }
                else{
                    map.put(key, 1);
                }
            }
            int sum = 1;

            for(String key : map.keySet()){
                sum *= (map.get(key) + 1);
            }
            sb.append(sum-1).append('\n');
        }
        System.out.println(sb);
    }
}
