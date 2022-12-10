class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        int i;
        long min, max;
        if (n % 2 == 0) {
            if (a[0] > a[1]) {
                max = a[0];
                min = a[1];
            } else {
                min = a[0];
                max = a[1];
            }
            i = 2;
            
        } else {
            min = a[0];
            max = a[0];
            i = 1;
        }
 
        
        while (i < n - 1) {
            if (a[i] > a[i + 1]) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i + 1] < min) {
                    min = a[i + 1];
                }
            } else {
                if (a[i + 1] > max) {
                    max = a[i + 1];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            i += 2;
        }
        
        pair p = new pair(min, max);
        
        return p;
    }
}