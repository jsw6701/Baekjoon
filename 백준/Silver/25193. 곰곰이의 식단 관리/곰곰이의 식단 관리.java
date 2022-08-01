import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int[] arr = new int[N];
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
            if(s.charAt(i) != 'C'){
                cnt++;
            }
        }

        cnt++;

        System.out.println(N / cnt);
    }
}