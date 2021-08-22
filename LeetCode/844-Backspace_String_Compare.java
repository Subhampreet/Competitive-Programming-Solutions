class Solution {
    public boolean backspaceCompare(String s, String t) {
        int S_pointer = s.length()-1;
        int T_pointer = t.length()-1;
        
        int S_skips = 0;
        int T_skips = 0;
        
        while(S_pointer >= 0 || T_pointer >= 0){
            
            while(S_pointer >= 0){
                if(s.charAt(S_pointer) == '#'){
                    S_skips += 1;
                    S_pointer -= 1;
                }
                else if(S_skips > 0){
                    S_pointer -= 1;
                    S_skips -= 1;
                }
                else{
                    break;
                }
            }
            
            while(T_pointer >= 0){
                if(t.charAt(T_pointer) == '#'){
                    T_skips += 1;
                    T_pointer -= 1;
                }
                else if(T_skips > 0){
                    T_pointer -= 1;
                    T_skips -= 1;
                }
                else{
                    break;
                }
            }
            
             if(S_pointer >= 0 && T_pointer >= 0 && s.charAt(S_pointer) != t.charAt(T_pointer)){
                 return false;
             }
            
            if((S_pointer >= 0) != (T_pointer >= 0)){
                return false;
            }
            
            S_pointer -= 1;
            T_pointer -= 1;
        }
        return true;
    }
}