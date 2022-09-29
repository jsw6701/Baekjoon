import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = s.length() / 2;
        boolean check = true;
        for (int i = 0; i < N; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                check = false;
            }
        }
        if(check == false){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}