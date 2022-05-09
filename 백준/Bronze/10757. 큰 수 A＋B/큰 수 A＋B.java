import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger big1 = new BigInteger(sc.next());
        BigInteger big2 = new BigInteger(sc.next());

        big1 = big1.add(big2);

        System.out.println(big1);
    }
}