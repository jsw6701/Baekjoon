import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {1, 3, 2, 4, 3};
        if(n >= 5){
            System.out.println(arr[n % 5] + (n / 5) - 1);
        }
        else if(n == 1 || n == 3){
            System.out.println(-1);
        }
        else{
            System.out.println(n / 2);
        }
    }
}
