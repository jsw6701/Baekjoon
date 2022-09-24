import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashSet<Integer> hashSet = new HashSet<>();
            for (int j = 0; j < N; j++) {
                hashSet.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                if(hashSet.contains(Integer.parseInt(st.nextToken()))){
                    sb.append(1).append('\n');
                }
                else{
                    sb.append(0).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
