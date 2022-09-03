import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(st.hasMoreTokens()){
                int x = Integer.parseInt(st.nextToken());
                if(s.equals("push")){
                    queue.offer(x);
                }
            }
            else{
                if(s.equals("front")){
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(queue.peekFirst()).append('\n');
                    }
                }
                else if(s.equals("back")){
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(queue.peekLast()).append('\n');
                    }
                }
                else if(s.equals("size")){
                    sb.append(queue.size()).append('\n');
                }
                else if(s.equals("empty")){
                    if(queue.isEmpty()){
                        sb.append(1).append('\n');
                    }
                    else{
                        sb.append(0).append('\n');
                    }
                }
                else if(s.equals("pop")){
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(queue.pollFirst()).append('\n');
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
