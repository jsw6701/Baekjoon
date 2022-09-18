import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        long result = 0;
        while(N-->0){
            long tmp = Long.parseLong(br.readLine());
            hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
            if(hashMap.get(tmp) > max){
                max = hashMap.get(tmp);
                result = tmp;
            }
            else if(hashMap.get(tmp) == max){
                result = Math.min(tmp, result);
            }
        }
        System.out.println(result);
    }
}
