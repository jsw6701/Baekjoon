import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("int a;");
        System.out.println("int *ptr = &a;");
        for (int i = 0; i < N-1; i++) {
            System.out.print("int ");
            for (int j = 0; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.print("ptr");
            System.out.print(i+2);
            System.out.print(" = &ptr");
            if(i+1 != 1){
                System.out.print(i+1);
            }
            System.out.print(";");
            System.out.println();
        }
    }
}