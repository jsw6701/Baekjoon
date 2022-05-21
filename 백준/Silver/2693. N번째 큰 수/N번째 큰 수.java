import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int[] A = new int[10];
            for(int j = 0; j < A.length; j++){
                A[j] = sc.nextInt();
            }
            Arrays.sort(A);
            System.out.println(A[7]);
        }
    }
}