import java.util.Scanner;
 
public class PolycarpAndCoins{
 
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- >= 1){
             String str = sc.next();
             int[] freq = new int[str.length()];  
             int  count = 0, one = 0;
             int  q = 0;
             
             
            char string[] = str.toCharArray();  
          
            for(int i = 0; i <str.length(); i++) {  
                freq[i] = 1;  
                if(string[i] == '0')
                    freq[i] = 0;
                else{
                   for(int j = i+1; j <str.length(); j++) {  
                    if(string[i] == string[j]) {  
                        freq[i]++;  
                          
                        string[j] = '0';  
                    }  
                   }   
                }
                
            }  
            
            for(int i = 0; i <freq.length; i++) {  
                if(freq[i] >= 2){
                    count++;
                }
                else if(freq[i] == 1){
                    one++;
                }
                else{
                    q = 0;
                }
            }  
            
            int m = one / 2;
            
            int ans = count  + m + q;
             
            System.out.println(ans);
         }
     }
}