import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 0;
        while(t > 0){
            if(t >= 5){
                t -= 5;
                count++;
            }
            else if(t == 4){
                t -= 4;
                count++;
            }
            else if(t == 3){
                t -= 3;
                count++;
            }
            else if(t == 2){
                t -= 2;
                count++;
            }
            else if(t == 1){
                t -= 1;
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
