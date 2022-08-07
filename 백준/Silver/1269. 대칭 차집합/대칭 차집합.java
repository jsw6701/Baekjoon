import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<Integer> hashSetA = new HashSet<>();
        HashSet<Integer> hashSetB = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            hashSetA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < B; i++) {
            hashSetB.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;

        for(int numA : hashSetA){
            if(!hashSetB.contains(numA)){
                count++;
            }
        }

        for(int numB : hashSetB){
            if(!hashSetA.contains(numB)){
                count++;
            }
        }

        System.out.println(count);
    }
}
