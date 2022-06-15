import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] N = new boolean[31];

        for(int i = 0; i < 28; i++){
            int A = sc.nextInt();
            N[A] = true;
        }

        for(int i = 1; i < 31; i++){
            if(!N[i]){
                System.out.println(i);
            }
        }
    }
}