import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static Queue<Integer> queue;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        arr = new int[100001];
        BFS(N);
    }

    public static void BFS(int N){
        arr[N] = 1;
        queue.add(N);

        while(!queue.isEmpty()){
            int tmp = queue.remove();
            if(tmp == K){
                System.out.println(arr[tmp]-1);
            }
            if(tmp - 1 >= 0 && arr[tmp - 1] == 0){
                arr[tmp - 1] = arr[tmp] + 1;
                queue.add(tmp-1);
            }
            if(tmp + 1 <= 100000 && arr[tmp + 1] == 0){
                arr[tmp + 1] = arr[tmp] + 1;
                queue.add(tmp+1);
            }
            if(2 * tmp <= 100000 && arr[tmp * 2] == 0){
                arr[tmp * 2] = arr[tmp] + 1;
                queue.add(tmp*2);
            }
        }
    }
}