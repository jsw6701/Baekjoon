import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int max = 0;
        while(N-->0){
            String s = br.readLine();
            if(hashMap.containsKey(s)){
                hashMap.put(s, hashMap.get(s) + 1);
            }
            else{
                hashMap.put(s, 1);
            }
            max = Math.max(max, hashMap.get(s));
        }

        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList);
        for(String key : arrayList){
            if(hashMap.get(key) == max){
                System.out.println(key);
                break;
            }
        }
    }
}
