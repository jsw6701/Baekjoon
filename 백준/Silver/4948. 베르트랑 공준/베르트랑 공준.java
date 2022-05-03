import java.util.Scanner;

public class Main {

    static boolean prime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int sum = 0;

            if(N == 0){
                break;
            }

            else{
                prime = new boolean[2 * N + 1];
                prime[0] = prime[1] = true;

                for(int i = 2; i*i <= 2*N; i++){
                    if(!prime[i]){
                        for(int j = i*i; j <= 2*N; j += i){
                            prime[j] = true;
                        }
                    }
                }

                for(int i = N+1; i <= 2*N; i++){
                    if(prime[i] == false){
                        sum++;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
