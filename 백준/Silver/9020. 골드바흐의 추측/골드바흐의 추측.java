import java.util.Scanner;

public class Main {

    static boolean prime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        prime = new boolean[10001];

        prime[0] = prime[1] = true;

        for(int i = 2; i*i <= 10000; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= 10000; j += i) {
                    prime[j] = true;
                }
            }
        }

        for(int i = 0; i < M; i++){
            int N = sc.nextInt();
            int tmp = 0;
            tmp = N / 2;

            if(prime[tmp] == false){
                System.out.println(tmp + " " + tmp);
            }
            else{
                for(int j = tmp; j > 0; j--){
                    if(prime[j] == false){
                        if(prime[N-j] == false){
                            System.out.println(j + " " + (N- j));
                            break;
                        }
                    }
                }
            }
        }
    }
}
