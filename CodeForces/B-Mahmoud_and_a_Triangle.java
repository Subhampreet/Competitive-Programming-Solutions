// https://codeforces.com/contest/766/problem/B

import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0 ; i < n ; i++){
		    a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int yes = 0;
		for(int i = 2; i < n; i++){
		    if(a[i-1]+a[i-2]>a[i]){
		        yes=1;
		        break;
		    }
		}
		if(yes == 1){
		   System.out.println("YES"); 
		}
		else{
		     System.out.println("NO"); 
		}
	}
}
