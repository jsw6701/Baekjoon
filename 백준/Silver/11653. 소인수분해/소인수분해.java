import java.util.Scanner;

public class Main {

    static int prime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        prime = new int[N+1];

        for(int i = 2; i <= N; i++){
            if(N % i == 0){
                N /= i;
                System.out.println(i);
                i--;
            }
        }
    }
}