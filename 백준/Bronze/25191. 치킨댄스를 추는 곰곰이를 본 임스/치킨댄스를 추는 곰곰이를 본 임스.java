import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;

        while(true){
            if(N > 0){
                if(A >= 2){
                    cnt++;
                    A -= 2;
                    N--;
                }
                else if(B >= 1){
                    cnt++;
                    B--;
                    N--;
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        System.out.println(cnt);
    }
}