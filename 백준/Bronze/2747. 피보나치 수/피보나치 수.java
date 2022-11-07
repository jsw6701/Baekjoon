import java.util.*;
 
 
public class Main {
     public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int n1=0;
         int n2=0;
         int temp1=0;
         int temp2=0;
         
         for(int i=0;i<n;i++) {
             if(i==0||i==1) {n1=n2;n2=1;}
             else {
                 temp1=n1;
                 temp2=n2;
                 n1=temp2;
                 n2=temp1+temp2;
             }
         }        
         System.out.println(n2);
    }
}
