import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<Integer, Integer> map;
    static int answer;
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        answer = 1;

        map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 1);
        }

        while(N > 0){
            int tmp = N % 10;
            solution(tmp);
            N /= 10;
        }

        System.out.println(answer);

    }

    public static void solution(int tmp){

        if(map.get(tmp) >= 1){
            map.put(tmp, map.get(tmp)-1);
        }
        else{
            if(tmp == 6){
                if(map.get(9) == 1){
                    map.put(9, map.get(9)-1);
                }
                else{
                    for (int i = 0; i < 10; i++) {
                        if(i != tmp){
                            map.put(i, map.get(i)+1);
                        }
                    }
                    answer++;
                }
            }
            else if(tmp == 9){
                if(map.get(6) == 1){
                    map.put(6, map.get(6)-1);
                }
                else{
                    for (int i = 0; i < 10; i++) {
                        if(i != tmp){
                            map.put(i, map.get(i)+1);
                        }
                    }
                    answer++;
                }
            }
            else{
                for (int i = 0; i < 10; i++) {
                    if(i != tmp){
                        map.put(i, map.get(i)+1);
                    }
                }
                answer++;
            }
        }
    }
}