import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- >= 1){
	        int n = sc.nextInt();
	        long a[] = new long[n];
	        Set<Long> distinctElements = new HashSet<>();
	        for(int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	            distinctElements.add(a[i]);
	        }
	        System.out.println(distinctElements.size());
	    }
	}
}