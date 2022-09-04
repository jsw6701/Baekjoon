import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int add = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());

        if((add + minus) % 2 != 0 || add < minus){
            System.out.println(-1);
        }
        else{
            int A = (add + minus) / 2;
            int B = A - minus;

            System.out.println(A + " " + B);
        }
    }
}