import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = N; j > i+1; j--){
                System.out.print(" ");
            }
            for(int k = 2*(N-i)-1; k < N * 2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N-1; i > 0; i--){
            for(int j = N; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 2*(N-i)+1; k < N * 2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
