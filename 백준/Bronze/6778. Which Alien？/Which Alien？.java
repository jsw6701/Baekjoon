import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        if(A >= 3){
            if(B <= 4) System.out.println("TroyMartian");
        }
        if(A <= 6){
            if(B >= 2) System.out.println("VladSaturnian");
        }
        if(A <= 2){
            if(B <= 3) System.out.println("GraemeMercurian");
        }
    }
}
