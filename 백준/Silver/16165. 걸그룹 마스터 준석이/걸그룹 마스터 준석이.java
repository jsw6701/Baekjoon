import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        HashMap<String, String[]> hashMap = new HashMap<>();
        while(N-->0){
            String team = br.readLine();
            int teamNum = Integer.parseInt(br.readLine());
            String[] member = new String[teamNum];
            for (int i = 0; i < teamNum; i++) {
                member[i] = br.readLine();
            }
            Arrays.sort(member);
            hashMap.put(team, member);
        }
        while(M-->0){
            String tmp = br.readLine();
            int k = Integer.parseInt(br.readLine());
            if(k == 0){
                for (String s : hashMap.get(tmp)){
                    sb.append(s).append('\n');
                }
            }
            else if(k == 1){
                for (String key : hashMap.keySet()){
                    for (String value : hashMap.get(key)) {
                        if(value.equals(tmp)){
                            sb.append(key).append('\n');
                        }
                    }
                }
            }
        }
        System.out.println(sb);
    }
}