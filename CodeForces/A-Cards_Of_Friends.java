import java.util.Scanner;
 
public class HelloWorld{
 
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- >= 1){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int sheets = 1;
            
            while (w % 2 == 0) {
                w = w / 2;
                sheets = sheets * 2;
            }
            while (h % 2 == 0) {
                h = h/2;
                sheets = sheets*2;
            }
            if(sheets>=n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
     }
}