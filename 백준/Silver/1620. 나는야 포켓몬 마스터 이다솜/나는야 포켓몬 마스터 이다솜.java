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

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            String num = Integer.toString(i);
            hashMap.put(num, name);
            hashMap.put(name, num);
        }

        StringBuilder sb = new StringBuilder();

        while(M-->0){
            sb.append(hashMap.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
