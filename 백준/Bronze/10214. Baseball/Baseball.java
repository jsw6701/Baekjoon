import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        final int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int score = 0;
            final int MATCH_COUNT = 9;
            for (int j = 0; j < MATCH_COUNT; j++) {
                final String[] input = br.readLine().split(" ");
                final int yScore = Integer.parseInt(input[0]);
                final int kScore = Integer.parseInt(input[1]);
                score = score - yScore + kScore;
            }
            sb.append(findResult(score));
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    private static String findResult(int score) {
        StringBuilder sb = new StringBuilder();
        final String KOREA = "Korea";
        final String YONSEI = "Yonsei";
        final String DRAW = "Draw";

        if (score > 0) {
            sb.append(KOREA);
        } else if (score < 0) {
            sb.append(YONSEI);
        } else {
            sb.append(DRAW);
        }
        sb.append("\n");
        return sb.toString();
    }
}