import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Character> strings = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("END")) break;
            for (int i = 0; i < s.length(); i++) {
                strings.add(s.charAt(i));
            }

            while(!strings.empty()){
                sb.append(strings.pop());
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
