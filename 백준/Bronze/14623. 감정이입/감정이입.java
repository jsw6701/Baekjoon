import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long B1 = Integer.parseInt(br.readLine(), 2);
        long B2 = Integer.parseInt(br.readLine(), 2);

        B1 = B1 * B2;

        String result = Long.toBinaryString(B1);

        System.out.println(result);
    }
}