import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] N = new int[26];

        for(int i = 0; i < s.length(); i++){
            N[s.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(N[i] + " ");
        }
    }
}
