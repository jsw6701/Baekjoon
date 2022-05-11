import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            if(A * A <= W*W + H*H){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }
    }
}