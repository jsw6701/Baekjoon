import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A, B, G = 0;
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<String, String> hashMap = new HashMap<>();

        while(A-->0){
            String s = st.nextToken();
            hashMap.put(s, "A");
        }

        st = new StringTokenizer(br.readLine());
        while(B-->0){
            String s = st.nextToken();
            hashMap.put(s, "B");
        }

        int countA = 0;
        int countB = 0;

        st = new StringTokenizer(br.readLine());
        while(G-->0){
            String s = st.nextToken();
            if(hashMap.get(s) == "A") countA++;
            else countB++;
        }

        if(countA > countB) System.out.println("A");
        else if(countA < countB) System.out.println("B");
        else System.out.println("TIE");

    }
}