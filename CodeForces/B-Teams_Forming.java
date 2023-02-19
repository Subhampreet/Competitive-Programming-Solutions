import java.util.Scanner;
import java.util.Arrays;
 
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    int count  = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n-1 ; i++){
            count += a[i+1] - a[i];
            i++;
        }
        System.out.println(count);
	}
}
