import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.next(), "/");

        int[] kda = new int[3];

        int i = 0;
        while (st.hasMoreTokens()){
            kda[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        if(kda[0] + kda[2] < kda[1]){
            System.out.println("hasu");
        }
        else if(kda[1] == 0){
            System.out.println("hasu");
        }
        else{
            System.out.println("gosu");
        }
    }
}