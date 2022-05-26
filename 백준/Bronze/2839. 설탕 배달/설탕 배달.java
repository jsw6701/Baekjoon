import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        if(N == 3){
            System.out.println(1);
        }
        else if(N == 5){
            System.out.println(1);
        }
        else if(N == 6){
            System.out.println(2);
        }
        else if(N == 4 || N==7){
            System.out.println(-1);
        }
        else{
            while (true) {
                if(N == 8){
                    System.out.println(2 + cnt);
                    break;
                }
                else if(N == 9){
                    System.out.println(3 + cnt);
                    break;
                }
                else if(N == 10){
                    System.out.println(2 + cnt);
                    break;
                }
                else if(N == 11){
                    System.out.println(3 + cnt);
                    break;
                }
                else if(N == 12){
                    System.out.println(4 + cnt);
                    break;
                }
                else{
                    N -= 5;
                    cnt++;
                }
            }
        }
    }
}