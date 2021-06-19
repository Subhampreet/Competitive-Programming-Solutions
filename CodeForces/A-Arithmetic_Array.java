import java.util.Scanner;
 
public class HelloWorld{
 
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         int t, n;
         int i;
         
         t = sc.nextInt();
         
         int[] tt = new int[t];
         
         for(i = 0; i < t; i++){
            n = sc.nextInt();
            
            int[] nn = new int[n];
            int sum = 0;
            int j;
            
            for(j = 0; j < n; j++){
                nn[j] = sc.nextInt();
            }
            
            for(j = 0; j< n; j++){
                sum = sum + nn[j];
            }
            
            float div = (float) sum / (float) n;
            
            if(div == 1.0)
                tt[i] = 0;
            else if(div > 1.0){
                if(sum - n == 1)
                    tt[i] = 1;
                else
                    tt[i] = sum - n;
            }
            else if(div < 1.0 )
                tt[i] = 1;
         }
         
         for(i = 0; i < t; i++){
             System.out.println(tt[i]);
         }
     }
}