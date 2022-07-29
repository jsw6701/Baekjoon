import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        arr = new Integer[X + 1];
        arr[0] = arr[1] = 0;

        for(int i=2; i<=X; i++) {
            // -1 연산을 수행할 경우
            arr[i] = arr[i-1] + 1; // +1은 연산을 수행한 카운터를 하나 올려줌

            if(i%3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
        }

        System.out.println(arr[X]);
    }

}