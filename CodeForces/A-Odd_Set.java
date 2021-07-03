import java.util.Scanner;
 
 
public class OddSet{
 
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         while(t-- >= 1){
             int n = sc.nextInt();
             int size = 2 * n;
             int arr[] = new int[size];
             
             int odd = 0;
             int even = 0;
             
            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            
            if(even == odd){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
             
         }
     }
}