import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w1 = sc.nextInt();
        int h1 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();
        int w3 = sc.nextInt();
        int h3 = sc.nextInt();

        int w = 0;
        int h = 0;

        if(w1 == w2){
            w = w3;
        }
        else if(w2 == w3){
            w = w1;
        }
        else{
            w = w2;
        }
        if(h1 == h2){
            h = h3;
        }
        else if(h2 == h3){
            h = h1;
        }
        else{
            h = h2;
        }

        System.out.println(w + " " + h);
    }
}
