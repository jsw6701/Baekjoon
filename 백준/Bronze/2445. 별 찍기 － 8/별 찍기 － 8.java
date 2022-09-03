import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 2*N-2; j > i*2; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < N-1; i++) {
            for (int j = N-1; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (i+1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = N-1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}