import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
    
        String ans = "";
        
        if (n%2 == 1){
            ans = "Weird";
        } else {
            if( n >= 6 && n <=20){
                ans = "Weird";
            }
            else{
                ans = "Not Weird";
            }
        }
        
        System.out.println(ans);

        scanner.close();
    }
}