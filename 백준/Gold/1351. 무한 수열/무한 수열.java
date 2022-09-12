import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int p;
    static int q;
    static HashMap<Long, Long> hashMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        System.out.println(infi(N));
    }
    public static long infi(long n){
        if(n == 0) return 1;
        if(hashMap.containsKey(n)) return hashMap.get(n);

        long a = infi(n / p);
        long b = infi(n / q);

        hashMap.put(n, a+b);

        return hashMap.get(n);
    }
}
