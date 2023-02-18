// https://codeforces.com/contest/1206/problem/B


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
 
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		
		List<Long> zeroes = new ArrayList<>();
		List<Long> positiveNumbers = new ArrayList<>();
		List<Long> negativeNumbers = new ArrayList<>();
		
		long inputtedNumber;
		
		for(int i = 0; i < n; i++){
		    inputtedNumber = sc.nextInt();
		    if(inputtedNumber > 0){
		        positiveNumbers.add(inputtedNumber);
		    }else if(inputtedNumber < 0){
		        negativeNumbers.add(inputtedNumber);
		    }
		    else{
		        zeroes.add(inputtedNumber);
		    }
		}
		
		long costOfCoins = 0;
		for(int i = 0 ; i < positiveNumbers.size() ; i++){
		    costOfCoins = costOfCoins + (positiveNumbers.get(i) - 1);
		}
		
		for(int i = 0 ; i < negativeNumbers.size() ; i++){
		    costOfCoins = costOfCoins + (- 1 - negativeNumbers.get(i));
		}
		
		if(zeroes.size() > 0){
		    costOfCoins = costOfCoins + zeroes.size();
		}else if (negativeNumbers.size() % 2 == 1){
		    costOfCoins = costOfCoins + 2;
		}
		
		System.out.println(costOfCoins);
 
	}
}