import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < N; i++) {
            if(s.charAt(i) == 'A'){
                sumA++;
            }
            else{
                sumB++;
            }
        }
        if(sumA > sumB){
            System.out.println("A");
        }
        else if(sumB > sumA){
            System.out.println("B");
        }
        else{
            System.out.println("Tie");
        }
    }
}
