import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++){
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while(!queue.isEmpty()){
                int[] tmp = queue.poll();
                boolean pf = true;
                for(int[] q : queue){
                    if(q[1] > tmp[1]){
                        pf = false;
                        break;
                    }
                }
                if(pf){
                    cnt++;
                    if(tmp[0] == M){
                        break;
                    }
                }
                else{
                    queue.add(tmp);
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}