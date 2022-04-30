import java.util.Scanner;

public class Main { // 에라토스테네스의 체

    static boolean prime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        prime = new boolean[N+1];

        prime[0] = prime[1] = true; // 0과 1은 소수에서 제외

        for(int i = 2; i*i <= N; i++) {
            // N이 10일 경우 i가 3까지 밖에 안되니 잘못된거 아닌가?
            //라는 생각이 있지만 사실 5, 7로 제외되는 소수들은 25, 49부터
            //즉, 제곱수부터 문제가 생기니 i * i 한 것으로 모두 해결된거임
            if (!prime[i]) { // false가 소수
                for (int j = i*i; j <= N; j += i) {
                    prime[j] = true;
                }
            }
        }
        int min = Integer.MAX_VALUE; // 최소로 초기화
        for(int i = M; i <= N; i++){
            if(!prime[i]){
                if(min > i){
                    min = i;
                }
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}