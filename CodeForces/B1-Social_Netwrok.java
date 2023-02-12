import java.util.Scanner;
import java.util.Stack;
 
public class Problem1234B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of friends
        int k = sc.nextInt(); //the size of conversation shown on screen
        int no;
        Stack<Integer> phoneConversations = new Stack<>();
        for (int i = 0; i < n; i++) {
            no = sc.nextInt();
            if(!(phoneConversations.contains(no))){
                if(phoneConversations.size() == k){
                    phoneConversations.remove(0);
                    phoneConversations.add(no);
                }else{
                    phoneConversations.add(no);
                }
            }else{
                continue; //no order changes and you just read the message
            }
        }
 
        String ans = "";
        //printing the elements of stack
        System.out.println(phoneConversations.size());
        while(!phoneConversations.isEmpty()){
            ans = ans+phoneConversations.pop()+" ";
        }
        System.out.println(ans.trim());
    }
}