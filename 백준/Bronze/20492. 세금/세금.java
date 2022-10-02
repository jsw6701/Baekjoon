import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result1 = (int) (N * 0.78);
        int result2 = (int) (N * 0.8 + (N * 0.2) * 0.78);
        System.out.println(result1 + " " + result2);
    }
}
