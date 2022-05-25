import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            if(A == 0){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        if(cnt < 0){
            System.out.println("Junhee is cute!");
        }
        else{
            System.out.println("Junhee is not cute!");
        }
    }
}