import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int sss = 665;

        while(count != N){
            sss++;

            if(String.valueOf(sss).contains("666")){
                count++;
            }
        }

        System.out.println(sss);
    }
}