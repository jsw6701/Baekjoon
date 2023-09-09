import java.io.*;
public class Main {

    static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fib(N);
        System.out.println(count + " " + fibonacci(N));
    }

    public static int fib(int n){
        if(n == 1){
            count++;
            return 1;
        } else if (n == 2) {
            count++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }

    }


    public static int fibonacci(int n){
        int count = 1;
        int[] arr = new int[n];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3 ; i < n ; i++){
            count++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return count;
    }
}