import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int sum = 0;
        int max = 0;

        int fd = sc.nextInt();
        int first = sc.nextInt();
        int pre = first;

        for(int i = 1; i < 6; i++) {
            int d = sc.nextInt();
            int len = sc.nextInt();

            max = Math.max(len*pre, max);
            sum += len*pre;
            pre = len;
        }
        sum += first * pre;
        max = Math.max(pre * first, max);
        
        int result = (max - (3 * max - sum)) * k;
        System.out.println(result);
    }
}