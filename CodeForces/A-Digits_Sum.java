import java.util.Scanner;
 
public class DigitalSum{
 
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >= 1){
            int n = sc.nextInt();
            int ans;
            
            ans = (n+1) / 10;
            
            System.out.println(ans);
        }
     }
}