import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int ap[][] = new int[15][15];

        for(int i = 0; i < 15; i++){
            ap[i][1] = 1;
            ap[0][i] = i;
        }

        for(int i = 1; i < 15; i++){
            for(int k = 2; k < 15; k++){
                ap[i][k] = ap[i][k-1] + ap[i-1][k];
            }
        }

        for(int i = 0; i < T; i++){
            int K = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(ap[K][N]);
        }
    }
}