import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();

        while(N-->0){
            hashSet.add(br.readLine());
        }

        int count = 0;

        StringBuilder sb = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList<>();

        while(M-->0){
            String s = br.readLine();
            if(hashSet.contains(s)){
                count++;
                linkedList.add(s);
            }
        }
        Collections.sort(linkedList);

        System.out.println(count);

        while(count-->0) {
            System.out.println(linkedList.pop());
        }        
    }
}