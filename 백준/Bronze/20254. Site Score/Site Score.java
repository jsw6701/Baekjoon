import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int UR = Integer.parseInt(st.nextToken());
        int TR = Integer.parseInt(st.nextToken());
        int UO = Integer.parseInt(st.nextToken());
        int TO = Integer.parseInt(st.nextToken());
        System.out.println(UR * 56 + TR * 24 + 14 * UO + 6 * TO);
    }
}
