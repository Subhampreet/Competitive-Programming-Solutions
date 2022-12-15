class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(a[i]);
        }
        for(int j = 0; j < m; j++){
            set.add(b[j]);
        }
        return set.size();
    }
}