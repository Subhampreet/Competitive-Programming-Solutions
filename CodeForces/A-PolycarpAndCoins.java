import java.util.Scanner;
 
public class PolycarpAndCoins{
 
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- >= 1){
             int n = sc.nextInt();
             int c1, c2;
             if(n % 3 == 0){
                 c1 = n/3;
                 c2 = n/3;
             }
             else if(n % 3 == 1){
                 c2 = n/3;
                 c1 = c2 + 1;
             }
             else{
                 c1 = n/3;
                 c2 = c1 + 1;
             }
             
             System.out.println(c1+" "+c2);
         }
     }
}