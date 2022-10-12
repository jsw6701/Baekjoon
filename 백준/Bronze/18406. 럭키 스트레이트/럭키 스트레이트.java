import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum1 = 0;
        for (int i = 0; i < s.length()/2; i++) {
            sum1 += s.charAt(i) - '0';
        }
        int sum2 = 0;
        for (int i = s.length()/2; i < s.length(); i++) {
            sum2 += s.charAt(i) - '0';
        }
        if(sum1 == sum2){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("READY");
        }
    }
}
