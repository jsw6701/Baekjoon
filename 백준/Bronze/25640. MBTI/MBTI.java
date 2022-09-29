import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while(N-->0){
            String tmp = br.readLine();
            if(s.equals(tmp)) count++;
        }
        System.out.println(count);
    }
}
