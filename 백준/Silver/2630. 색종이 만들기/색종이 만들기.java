import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int white = 0;
    static int blue = 0;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paper(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    public static boolean check(int x, int y, int size){
        int standard = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(standard != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void paper(int x, int y, int size){
        if(check(x, y, size)){
            if(arr[x][y] == 0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        paper(x, y, newSize);
        paper(x, y+newSize, newSize);
        paper(x+newSize, y, newSize);
        paper(x+newSize, y+newSize, newSize);
    }
}
