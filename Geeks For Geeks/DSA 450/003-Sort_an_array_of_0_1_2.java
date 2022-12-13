class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int i, j, k;
        i = j = 0;
        k = n-1;
        int temp;
        while(j <= k){
            if(a[j] == 0){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }
            else if(a[j] == 1){
                j++;
            }
            else{
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
                k--;
            }
        }
    }
}