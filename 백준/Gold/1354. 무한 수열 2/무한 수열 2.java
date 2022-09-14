import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Long, Long> hashMap = new HashMap<>();
    static int P;
    static int Q;
    static int X;
    static int Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());

        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        System.out.println(infinity(N));
    }

    public static long infinity(long n){

        if(n <= 0) return 1;
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        long a = infinity((n / P) - X);
        long b = infinity((n / Q) - Y);
        
        hashMap.put(n, a+b);
        return hashMap.get(n);
    }
}
