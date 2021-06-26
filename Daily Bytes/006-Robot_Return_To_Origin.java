// This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

// Ex: Given the following strings...

// "LR", return true
// "URURD", return false
// "RUULLDRD", return true


class Solution {
    public boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;
        
        for(int i = 0; i < moves.length(); i++){
            char currentMove = moves.charAt(i);
            if(currentMove == 'U'){
                UD++;
            } 
            else if(currentMove == 'D'){
                UD--;
            }
            else if(currentMove == 'L'){
                LR++;
            }
            else{
                LR--;
            }
        }
        
        return (UD == 0 && LR ==0);
    }
}