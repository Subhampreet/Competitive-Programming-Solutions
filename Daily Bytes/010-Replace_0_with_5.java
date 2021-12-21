public class Replace0With5{
    
    static int replace0with5(int number)
    {
        return number += calculateAddedValue(number);
    }
 
    // returns the number to be added to the
    // input to replace all zeroes with five
    private static int calculateAddedValue(int number)
    {
 
        // amount to be added
        int result = 0;
 
        // unit decimal place
        int decimalPlace = 1;
 
        if (number == 0) {
            result += (5 * decimalPlace);
        }
 
        while (number > 0) {
            if (number % 10 == 0)
                // a number divisible by 10, then
                // this is a zero occurrence in the input
                result += (5 * decimalPlace);
 
            // move one decimal place
            number /= 10;
            decimalPlace *= 10;
        }
        return result;
    }

     public static void main(String []args){
        System.out.print(replace0with5(1020));
     }
}