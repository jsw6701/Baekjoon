import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger sum = new BigInteger("0");

        int N = sc.nextInt();
        String s = sc.next();


        for(int i = 0; i < N; i++){
            sum = sum.add(BigInteger.valueOf(s.charAt(i) -96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }
}