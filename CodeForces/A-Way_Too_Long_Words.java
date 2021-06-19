import java.util.Scanner;
 
public class Way{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int i;
        String[] arr = new String[n];
        
        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextLine();
        }
        
        for(i= 0 ; i < n ; i++){
            if(arr[i].length()>10){
                System.out.println(arr[i].charAt(0)+""+(arr[i].length()-2)+""+arr[i].charAt(arr[i].length()-1));
            }
            else
                System.out.println(arr[i]);
        }
    }
}