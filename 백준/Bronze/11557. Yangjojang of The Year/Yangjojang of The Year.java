import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int max = 0;
        String st;
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            String S = sc.next();
            int L = sc.nextInt();
            max = L;
            st = S;
            for(int j = 1; j < N; j++){
                String S2 = sc.next();
                int L2 = sc.nextInt();
                max = Math.max(L2, max);
                if(max == L2){
                    st = S2;
                }
            }
            System.out.println(st);
        }
    }
}