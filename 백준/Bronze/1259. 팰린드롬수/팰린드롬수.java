import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int i = sc.nextInt();
            int cnt = 0;
            if(i == 0){
                break;
            }
            else{
                String s = Integer.toString(i);

                for(int j = 0; j < s.length() / 2; j++){
                    if(s.charAt(j) == s.charAt(s.length()-1-j)){
                        cnt++;
                    }
                }

                if(cnt == s.length() / 2){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    }
}