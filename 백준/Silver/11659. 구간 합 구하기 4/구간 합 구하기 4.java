import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        int[] N = new int[Integer.parseInt(st.nextToken()) + 1];

        int count = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i < N.length; i++){
            N[i] = N[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = N[B] - N[A-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}