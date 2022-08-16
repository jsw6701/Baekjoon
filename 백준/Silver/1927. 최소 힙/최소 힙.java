import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            int x = Integer.parseInt(br.readLine());
            if(x != 0){
                priorityQueue.add(x);
            }
            else if(priorityQueue.isEmpty()){
                sb.append('0').append('\n');
            }
            else{
                sb.append(priorityQueue.poll()).append('\n');
            }
        }

        System.out.println(sb);
    }
}