import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int j=0; j<arr.length; j++){
            arr[j] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        double average = 0;
        
        for(int i=0; i<arr.length; i++){
            average += arr[i]/arr[arr.length-1]*100;
        }
        average = average / arr.length;
        System.out.println(average);
    }
}
