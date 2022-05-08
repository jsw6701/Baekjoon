import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tmp = N;
        int cnt = 0;

        while(tmp != 0){
            cnt++;
            tmp /= 10;
        }

        tmp = N - (cnt * 9);

        int result = 0;
        for(int i = tmp; i < N; i++){
            int sum = 0;
            int tmp2 = i;
            while(tmp2 != 0){
                sum += tmp2 % 10;
                tmp2 /= 10;
            }
            if(sum + i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}