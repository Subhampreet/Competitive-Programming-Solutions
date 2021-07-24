// A simple approach is to do a linear search, i.e  

// - Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
// - If x matches with an element, return the index.
// - If x doesn’t match with any of elements, return -1.

// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1
 
class LinearSearch
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}

