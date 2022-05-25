import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for(int i = 0; i < 6; i++){
            a[i] = sc.nextInt();
        }

        System.out.println((1 - a[0]) + " " + (1 - a[1]) + " " + (2 - a[2]) + " " + (2 - a[3]) + " " + (2 - a[4])+ " " + (8 - a[5]));


    }
}
