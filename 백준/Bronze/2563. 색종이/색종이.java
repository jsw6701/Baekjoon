import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] P = new int[101][101];


        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            for(int j = A; j < A + 10; j++){
                for(int k = B; k < B + 10; k++){
                    P[j][k] = 1;
                }
            }
        }

        int cnt = 0;

        for(int j = 0; j < 100; j++){
            for(int k = 0; k < 100; k++){
                if(P[j][k] == 1){
                    cnt ++;
                }
            }
        }

        System.out.println(cnt);
    }
}