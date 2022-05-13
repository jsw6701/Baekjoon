import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for(int i = 0; i < 8; i++){
            String s = sc.next();
            if(i % 2 == 0){
                for(int j = 0; j < 4; j++){
                    if(s.charAt(2*j) == 'F'){
                        cnt++;
                    }
                }
            }
            else{
                for(int j = 0; j < 4; j++){
                    if(s.charAt(2*j+1) == 'F'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}