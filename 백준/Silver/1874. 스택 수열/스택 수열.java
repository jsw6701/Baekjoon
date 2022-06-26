import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        
        while(N --> 0){
            int p = Integer.parseInt(br.readLine());

            if(p >= cnt){
                for(int i = cnt; i <= p; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                    cnt++;
                }

            }
            else if(stack.peek() != p){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}