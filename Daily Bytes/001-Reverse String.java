// This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

// Ex: Given the following strings...

// “Cat”, return “taC”
// “The Daily Byte”, return "etyB yliaD ehT”
// “civic”, return “civic”




import java.lang.*;
import java.io.*;
import java.util.*;


public class ReverseString{

     public static void main(String []args){
        String input; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired String: ");
        input = sc.nextLine();
        
        byte[] strAsByteArray = input.getBytes();
        
        byte[] result = new byte[strAsByteArray.length];
        
        for (int i = 0; i < strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        
        System.out.println(new String(result));
     }
}