import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int tmp = N / H;
            int tmp2 = (N % H) * 100;

            if(N % H == 0){
                System.out.println((H * 100) + tmp);
            }
            else{
                System.out.println(tmp2 + (tmp +1));
            }
        }
    }
}