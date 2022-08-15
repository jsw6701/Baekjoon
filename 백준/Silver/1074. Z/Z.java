import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int N, R, C, tmp = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        Z((int)Math.pow(2, N), 0, 0);
    }

    static void Z(int size, int r, int c){
        if(size == 1){
            System.out.println(tmp);
            return;
        }
        int reSize = size / 2;
        if(R < reSize + r && C < reSize + c){
            Z(reSize, r, c);
        }
        else if(R < reSize + r && C >= reSize + c){
            tmp += (size * size) / 4;
            Z(reSize, r, c + reSize);
        }
        else if(R >= reSize + r && C < reSize + c){
            tmp += ((size * size) / 4) * 2;
            Z(reSize, r + reSize, c);
        }
        else{
            tmp += ((size * size) / 4) * 3;
            Z(reSize, r + reSize, c + reSize);
        }
    }
}
