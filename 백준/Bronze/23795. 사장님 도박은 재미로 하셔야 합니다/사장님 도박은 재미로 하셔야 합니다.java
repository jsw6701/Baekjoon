import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){
            int tmp = sc.nextInt();
            if(tmp != -1){
                sum += tmp;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
    }
}