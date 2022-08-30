import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Kim = Integer.parseInt(st.nextToken());
        int Lim = Integer.parseInt(st.nextToken());
        int count = 0;
        while(Kim != Lim){
            Kim = Kim / 2 + Kim % 2;
            Lim = Lim / 2 + Lim % 2;
            count++;
        }
        System.out.println(count);
    }
}
