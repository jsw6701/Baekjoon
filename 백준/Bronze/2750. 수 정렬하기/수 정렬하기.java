import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int s[] = new int[N];

        for(int i = 0; i < N; i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);

        for(int i = 0; i < N; i++){
            System.out.println(s[i]);
        }
    }
}