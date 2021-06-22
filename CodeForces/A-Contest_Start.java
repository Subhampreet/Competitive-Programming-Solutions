import java.util.Scanner;
 
public class HelloWorld{
 
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
         
         for(int i = 0; i < k; i++){
             long n = sc.nextInt();
             long x = sc.nextInt();
             long t = sc.nextInt();
             
             if(t < x){
                 System.out.println("0");
                 continue;
             }
             long first = t/x;
             if(first >= n-1){
                 long ans = n - 1;
                 ans = (ans * (ans + 1))/2;
                 System.out.println(ans);
             }
             else{
                 long ans1 = first;
                 ans1 = (ans1 * (ans1 + 1))/2;
                 long ans2 = (n -1 - first) * first;
                 long ansf = ans1 + ans2;
                 System.out.println(ansf);
             }
         }
         
     }
}