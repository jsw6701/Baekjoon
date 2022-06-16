import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int B = sc.nextInt();
            int G = sc.nextInt();

            if((B==0)&&(G==0)){
                break;
            }
            else{
                System.out.println(G+B);
            }
        }
    }
}