import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        sb.append("<");
        while(queue.size() != 1){
            for(int i = 1; i <= K; i++){
                if(i == K){
                    sb.append(queue.remove() + ", ");
                }
                else{
                    queue.add(queue.remove());
                }
            }
        }
        sb.append(queue.remove() + ">");

        System.out.println(sb);
    }
}