import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        System.out.printf("<");
        circle(N, K);
        System.out.printf(">");
    }

    public static void circle(int N, int K){
        while(!queue.isEmpty()){
            for (int i = 0; i < K-1; i++) {
                queue.add(queue.remove());
            }
            System.out.print(queue.remove());
            if(!queue.isEmpty()){
                System.out.print(", ");
            }
        }
    }
}