import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            sb.append(correct(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static String correct(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}