import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        int[][] cnt = new int[s.length()][26];
        
        cnt[0][s.charAt(0)-'a']++; // for문 내에서 0을 설정하기에는 범위초과 일어남 미리 설정해두는게 좋음
        
        for(int i = 1; i < s.length(); i++){
            int tmp = s.charAt(i) - 'a'; // 문자 숫자로 변환 0부터 26
            for(int j = 0; j < 26; j++){
                cnt[i][j] = cnt[i-1][j]; // 누적 합을 구하므로 다음자리에 전자리들의 문자정보 저장
            }
            cnt[i][tmp]++; // 이번 자리의 문자 1추가
        }

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0){
                sb.append(cnt[B][c-'a']).append('\n');
            }
            else{
                sb.append(cnt[B][c-'a'] - cnt[A-1][c-'a']).append('\n'); // A-1까지를 빼야지 A자리도 포함이 됨
            }
        }
        System.out.println(sb);
    }
}