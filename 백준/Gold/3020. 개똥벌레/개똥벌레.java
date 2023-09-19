import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] top;
    static int[] bottom;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        top = new int[n/2];
        bottom = new int[n/2];

        for (int i = 0; i < n/2; i++) {
            bottom[i] = Integer.parseInt(br.readLine());
            top[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bottom);
        Arrays.sort(top);

        int min = n;
        int cnt = 0;
        for (int i = 1; i < h+1; i++) {
            int conflict = binarySearch(bottom, i) + binarySearch(top, h - i + 1);
            if(min == conflict) {
                cnt++;
                continue;
            }
            if(min > conflict) {
                min = conflict;
                cnt=1;
            }
        }
        System.out.println(min + " " + cnt);
    }

    public static int binarySearch(int[] arr, int h){
        int left = 0;
        int right = n / 2;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] >= h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return arr.length - right;
    }
}