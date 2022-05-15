import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];
        int[] c = new int[N+M];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            c[i] = A[i];
        }
        for(int i = N; i < N + M; i++){
            c[i] = B[i-N];
        }
        Arrays.sort(c);
        for(int i = 0; i < N + M; i++){
            bw.write(c[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}