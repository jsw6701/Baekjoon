import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println("SciComLove");
        }
        else{
            for (int i = 0; i < N; i++) {
                System.out.println("SciComLove");
            }
        }
    }
}