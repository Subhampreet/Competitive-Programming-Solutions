import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StringBuilder number = new StringBuilder(sc.next());
	    System.out.println(number.toString()+""+number.reverse());
	}
}