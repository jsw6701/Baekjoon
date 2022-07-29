import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = new int[Integer.parseInt(br.readLine())];

        for (int i = 0; i < N.length; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < N.length; i++) {
            sum += N[i];
        }
        System.out.println((int)Math.round((double) sum / N.length));

        Arrays.sort(N);

        System.out.println(N[N.length/2]);

        int[] count = new int[8001];

        for (int i = 0; i < N.length; i++) {
            count[N[i]+4000]++;
        }
        int max = 0;

        for(int i = 0; i < 8001; i++){
            max = Math.max(max, count[i]);
        }
        boolean flag = false;
        int result = 0;

        for(int i = 0; i < 8001; i++){
            if(flag == false && max == count[i]){
                flag = true;
                result = i - 4000;
            }
            else if(flag == true && max == count[i]){
                result = i - 4000;
                break;
            }
        }
        System.out.println(result);
        System.out.println(N[N.length-1] - N[0]);
    }
}
