import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        N = 1000 - N;

        int cnt = 0;

        cnt += N / 500;
        N %= 500;

        cnt += N / 100;
        N %= 100;

        cnt += N / 50;
        N %= 50;

        cnt += N / 10;
        N %= 10;

        cnt += N / 5;
        N %= 5;

        cnt += N / 1;

        System.out.println(cnt);
    }
}