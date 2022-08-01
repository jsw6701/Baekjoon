import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(M-->0){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("add")){
                hashSet.add(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("remove")){
                hashSet.remove(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("check")){
                if(hashSet.contains(Integer.parseInt(st.nextToken()))){
                    sb.append(1).append('\n');
                }
                else{
                    sb.append(0).append('\n');
                }
            }
            else if(s.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                if(hashSet.contains(x)){
                    hashSet.remove(x);
                }
                else{
                    hashSet.add(x);
                }
            }
            else if(s.equals("all")){
                hashSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
            }
            else if(s.equals("empty")){
                hashSet.clear();
            }
        }

        System.out.println(sb);
    }
}
