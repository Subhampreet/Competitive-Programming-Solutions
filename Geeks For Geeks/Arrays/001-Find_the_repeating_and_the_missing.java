// Link - https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

import java.io.*;

public class Solution{   
    

     public static void main(String []args){
         int[] v = { 4, 3, 6, 2, 1, 6, 7 };
         
         int n = v.length;
         
         int sum = n * (n + 1) / 2;
         int sum_square = n * (n+1) * (2 * n + 1) / 6;
         
         for(int i = 0 ; i < n; i++){
             sum = sum - v[i];
             sum_square = sum_square - (v[i] * v[i]);
         }
         
         int missing = ((sum_square / sum) + sum) / 2;
         int repeating = missing - sum;
         
         System.out.println("Missing Number is "+ missing);
         System.out.println("Repeating Number is "+ repeating);

     }
}