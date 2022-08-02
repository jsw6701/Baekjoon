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
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();

        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();

            hashMap.put(key, value);
        }

        StringBuilder sb = new StringBuilder();

        while(M-->0){
            String wantFind = br.readLine();
            if(hashMap.containsKey(wantFind)){
                sb.append(hashMap.get(wantFind)).append('\n');
            }
        }

        System.out.println(sb);
    }
}