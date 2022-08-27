import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int fin = Integer.parseInt(st.nextToken());
            arr[i][0] = start;
            arr[i][1] = fin;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1] - o2[1];
                }
            }
        });
        int count = 0;
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if(pre <= arr[i][0]){
                pre = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
