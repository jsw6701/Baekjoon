import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //요리시간 초
		int A = 0;
		int B = 0;
		int C = 0;
		
		if(T>=300) {
			A = T/300;
			T -= 300 * A;
		}
		
		if(T>=60) {
			B = T/60;
			T -= 60 * B;
		}
		
		if(T%10!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		else {
			C = T/10;
			
			System.out.println(A + " " + B + " " + C);
		}
	}
}