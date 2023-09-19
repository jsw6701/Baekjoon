import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] budget;
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        budget = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
            sum += budget[i];
        }
        int maxBudget = Integer.parseInt(br.readLine());

        Arrays.sort(budget);


        int low = 0;
        int high = budget[n-1];
        int mid = 0;

        if(sum > maxBudget){
            while(low <= high){
                sum = 0;
                mid = (low + high) / 2;

                for (int i = 0; i < n; i++) {
                    if(mid >= budget[i]){
                        sum += budget[i];
                    }
                    else{
                        sum += mid;
                    }
                }

                if(sum > maxBudget){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            System.out.println(high);
        }
        else{
            System.out.println(budget[n-1]);
        }
    }
}