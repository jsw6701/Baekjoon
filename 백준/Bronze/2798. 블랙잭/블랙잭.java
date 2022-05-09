import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int card[] = new int[N];

        for(int i = 0; i < N; i++){
            card[i] = sc.nextInt();
        }
        int sum = 0;
        int tmp = 0;

        for(int i = 0; i < N - 2; i++){
            for(int k = i + 1; k < N - 1; k++){
                for(int j = k + 1; j < N; j++){
                    sum = card[i] + card[k] + card[j];
                    if(sum == M){
                        tmp = sum;
                        break;
                    }
                    else if(tmp < sum && sum < M){
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}
