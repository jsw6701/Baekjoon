import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();

        int total = hour * 60 + minute + time;
        hour = total / 60;
        minute = total % 60;

        if(hour >= 24){
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
        
        /*if(minute + time >= 60){
            hour += (minute + time) / 60;
            if(hour >= 24){
                hour -= 24;
            }
            System.out.println(hour + " " + ((minute +  time) - 60));
        }
        else{
            System.out.println(hour + " " + (minute + time));
        }*/
    }
}