import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long S = Long.parseLong(br.readLine());
        long tmp = 1;
        long sum = 0;
        while(S > sum){
            tmp++;
            sum += tmp;
        }
        System.out.println(tmp - 1);
    }
}