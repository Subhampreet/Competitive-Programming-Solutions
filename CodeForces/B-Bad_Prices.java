import java.util.Scanner;
 
/**
 * <a href="https://codeforces.com/problemset/problem/1213/B"/>
 */
public class Problem1213B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=1){
            int n = sc.nextInt();
            int prices[] = new int[n];
            for(int i =0; i<n;i++){
                prices[i] = sc.nextInt();
            }
            int countOfBadDays = 0;
            int min = prices[n-1];
            for(int i=n-2; i>=0;i--){
                if(prices[i]>min){
                    //we have compared that price of today is greater than the minimum value
                    countOfBadDays++;
                }
                min = Math.min(prices[i], min);
            }
            System.out.println(countOfBadDays);
        }
 
    }
}