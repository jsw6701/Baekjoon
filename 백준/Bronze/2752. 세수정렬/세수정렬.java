import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] N = new int[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            N[i] = sc.nextInt();
        }
        Arrays.sort(N);

        for(int i = 0; i < 3; i++){
            System.out.print(N[i] + " ");
        }
    }
}