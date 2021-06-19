import java.util.Scanner;
 
public class HelloWorld{
 
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            
            int ans = 0;
            
 
            if(n % 2 == 1){
                System.out.println("Bob");
            }
            
            else{
                boolean k = false;
                int cnt = 0;
                
                while(n % 2 == 0){
                    n/=2;
                    k = !k;
                    cnt++;
                    k = (!k)&(k);
                }
                
                if(n>1){
                    System.out.println("Alice");
                    k=!k;
                }    
                else{
                    if(cnt%2 == 1){
                        System.out.println("Bob");
                    }
                    else{
                        System.out.println("Alice");
                    }
                }
            }
         }
     }
}