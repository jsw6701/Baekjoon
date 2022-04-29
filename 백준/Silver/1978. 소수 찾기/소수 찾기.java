import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++){
            int pn = 0;
            int k = sc.nextInt();
            for(int j = 1; j < 1001; j++){
                if(k % j == 0 && k > j){
                    pn++;
                }
            }
            if(pn == 1){
                sum++;
            }
        }
        System.out.print(sum);
    }
}