class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    
        if(num == null || num.length == 0)
            return res;
        
        int n = num.length;
        
        Arrays.sort(num);
        
        for(int i = 0; i < n; i++){
            
            for(int j = i + 1; j < n; j++){
                int target_2 = target - num[j] - num[i];
                
                int front = j + 1;
                int back = n - 1;
                
                while(front < back){
                    int two_sum = num[front] + num[back];
                    
                    if(two_sum < target_2) front++;
                    
                    else if (two_sum > target) back--;
                    
                    else{
                        List<Integer> quad = new ArrayList();
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                        
                        // Processing the duplicates of number 3
                        while(front < back && num[front] == quad.get(2)) ++front;
                        // Processing the duplicates of number 4
                        while(front < back && num[back] == quad.get(3)) --back;
                    }
                }
                
                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;                
            }
            while(i + 1 < n && num[i+1] == num[i]) ++i;
        }
        
        return res;
    }
}