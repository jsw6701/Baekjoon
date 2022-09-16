import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> hashMap = new HashMap<>();
        while(N-->0){
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String s1 = st.nextToken();
            hashMap.put(s1, hashMap.getOrDefault(s1, 0) + 1);
        }
        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList);
        for(String s : arrayList){
            System.out.println(s + " " + hashMap.get(s));
        }
    }
}