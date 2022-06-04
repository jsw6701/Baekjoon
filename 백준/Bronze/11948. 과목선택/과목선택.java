import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        System.out.println(Math.max((Math.max(Math.max((A+B+C), (A+B+D)),(B+C+D))),(A+C+D)) + Math.max(E, F));
    }
}