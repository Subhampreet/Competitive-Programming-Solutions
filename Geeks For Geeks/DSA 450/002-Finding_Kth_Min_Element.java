class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int n = l - r + 1;
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    } 
}