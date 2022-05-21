import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[8];

        for(int i = 0; i < N.length; i++){
            N[i] = sc.nextInt();
        }

        int[] tmp = N.clone();

        Arrays.sort(tmp);

        int sum = 0;
        for(int i = 3; i < tmp.length; i++){
            sum += tmp[i];
        }
        System.out.println(sum);

        int[] s = new int[5];
        int k = 0;

        for(int i = 0; i < N.length; i++){
            if(tmp[3] == N[i]){
                s[k] = i + 1;
                k++;
            }
            else if(tmp[4] == N[i]){
                s[k] = i + 1;
                k++;
            }
            else if(tmp[5] == N[i]){
                s[k] = i + 1;
                k++;
            }
            else if(tmp[6] == N[i]){
                s[k] = i + 1;
                k++;
            }
            else if(tmp[7] == N[i]){
                s[k] = i + 1;
                k++;
            }
        }

        Arrays.sort(s);

        for(int i = 0; i < s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
}