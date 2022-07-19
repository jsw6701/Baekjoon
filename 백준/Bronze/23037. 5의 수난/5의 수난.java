import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int tmp = s.charAt(i) - 48;
            sum += Math.pow(tmp, 5);
        }

        System.out.println(sum);
    }
}