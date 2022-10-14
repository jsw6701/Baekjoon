import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, int[]> hashMap = new HashMap<String, int[]>() {{
            put("black", new int[]{0, 1});
            put("brown", new int[]{1, 10});
            put("red", new int[]{2, 100});
            put("orange", new int[]{3, 1000});
            put("yellow", new int[]{4, 10000});
            put("green", new int[]{5, 100000});
            put("blue", new int[]{6, 1000000});
            put("violet", new int[]{7, 10000000});
            put("grey", new int[]{8, 100000000});
            put("white", new int[]{9, 1000000000});
        }};

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        long sum = 0;

        sum += hashMap.get(s1)[0] * 10L;
        sum += hashMap.get(s2)[0];
        sum *= hashMap.get(s3)[1];
        System.out.println(sum);
    }
}