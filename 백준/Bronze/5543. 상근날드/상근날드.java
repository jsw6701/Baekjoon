import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[2];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println(A[0] + B[0] - 50);
    }
}