class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num_j = 0;
        
        for(int i  = 0; i < stones.length(); i++){
             if(jewels.indexOf(stones.charAt(i)) > -1){
                 num_j += 1;
             }
        }
        return num_j;
    }
}