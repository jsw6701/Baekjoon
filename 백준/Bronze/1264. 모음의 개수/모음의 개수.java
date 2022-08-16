import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            int count = 0;
            st = new StringTokenizer(br.readLine());
            String end = st.nextToken();
            if(end.equals("#")){
                break;
            }
            else{
                for (int i = 0; i < end.length(); i++) {
                    if(end.charAt(i) == 'a' || end.charAt(i) == 'e' || end.charAt(i) == 'i' || end.charAt(i) == 'o' || end.charAt(i) == 'u'|| end.charAt(i) == 'U'|| end.charAt(i) == 'O'|| end.charAt(i) == 'I'|| end.charAt(i) == 'A'|| end.charAt(i) == 'E'){
                        count++;
                    }
                }
            }
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U' ||s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}