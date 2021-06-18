import java.util.Scanner;
 
public class Watermelon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a_pointer = 2, b_pointer = w - 2;
        
        if( w <= 2)
            System.out.println("NO");
        else if( w % 2 == 0){
            while(a_pointer <= b_pointer){
                if(a_pointer + b_pointer == w){
                    System.out.println("YES");
                    break;
                }
                b_pointer-=2;
            }
        }
        else
            System.out.println("NO");
    }
}