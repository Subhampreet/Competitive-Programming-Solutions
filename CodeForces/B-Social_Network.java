import java.util.Scanner;
 
import java.util.Stack;
 
 
public class HelloWorld{
 
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt(); // The number of friends
         int k = sc.nextInt(); // The Size of Conversation displayed on screen
         
         int no;
         Stack<Integer> phoneC = new Stack<>();
         for(int i = 0 ; i < n ; i++){
             no = sc.nextInt();
             if(!(phoneC.contains(no))){
                 if(phoneC.size() == k){
                     phoneC.remove(0);
                     phoneC.add(no);
                 }else{
                     phoneC.add(no);
                 }
             }
             else{
                 continue;
             }
         }
         
         String ans = "";
         System.out.println(phoneC.size());
 
         while(!phoneC.isEmpty()){
             ans = ans+phoneC.pop()+" ";
         }
         System.out.println(ans.trim());
     }
}