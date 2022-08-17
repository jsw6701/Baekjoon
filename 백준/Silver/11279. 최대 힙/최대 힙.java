import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            int x = Integer.parseInt(br.readLine());

            if(x != 0){
                priorityQueue.add(x);
            }
            else if(x == 0){
                if(priorityQueue.isEmpty()){
                    sb.append(0).append('\n');
                }
                else{
                    sb.append(priorityQueue.poll()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}