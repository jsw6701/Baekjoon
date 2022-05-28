import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(c(N, K));
    }

    public static int c(int n, int k){
        if(n == k || k == 0){
            return 1;
        }
        else{
            return c(n-1, k-1) + c(n-1, k);
        }
    }
}