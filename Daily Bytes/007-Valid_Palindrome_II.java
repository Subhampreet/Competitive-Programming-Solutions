class Solution {
    public boolean validPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        
        while(a_pointer <= b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
                return helperMethod(s, a_pointer+1, b_pointer) || helperMethod(s, a_pointer, b_pointer-1);
            }
            
            a_pointer++;
            b_pointer--;
            
        }
        
        return true;
    }
    
    public boolean helperMethod(String s, int i, int j){
        int a_pointer = i;
        int b_pointer = j;
        
        while(a_pointer <= b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
                return false;
            }
            
            a_pointer++;
            b_pointer--;            
        }  
        return true;        
    }
}