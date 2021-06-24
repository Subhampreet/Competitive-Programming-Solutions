import java.util.Scanner;
 
import java.util.Stack;
 
 
public class HelloWorld{
 
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         
        int t = sc.nextInt();
        while(t-- >= 1){
            int n = sc.nextInt();
            int prices[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                prices[i] = sc.nextInt();
            }
            int count = 0;
            
            int min = prices[n-1];
            
            for(int i = n-2; i>=0; i--){
                if(prices[i]>min){
                    count++;
                }
                min = Math.min(prices[i], min);
            }
            System.out.println(count);
        } 
     }
}