import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if(s.equals(".")) {
                break;
            }
            sb.append(check(s)).append("\n");
        }

        System.out.println(sb);
    }

    public static String check(String s){

        stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[') {
                stack.push('[');
            } else if (c == '(') {
                stack.push('(');
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            }

        }

        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}
