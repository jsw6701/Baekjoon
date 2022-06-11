import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        for(int i = s.length()-5; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }

    }
}