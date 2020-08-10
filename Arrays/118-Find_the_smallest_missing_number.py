# Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array.

# Examples
# Input: {0, 1, 2, 6, 9}, n = 5, m = 10
# Output: 3

# Input: {4, 5, 10, 11}, n = 4, m = 12
# Output: 0

# In the standard Binary Search process, the element to be searched is compared with the middle element and on the basis of comparison result, we decide whether to search is over or to go to left half or right half.
# In this method, we modify the standard Binary Search algorithm to compare the middle element with its index and make decision on the basis of this comparison.

# 1) If the first element is not same as its index then return first index
# 2) Else get the middle index say mid
#     a) If arr[mid] greater than mid then the required element lies in left half.
#     b) Else the required element lies in right half.


# Python3 program to find the smallest 
# elements missing in a sorted array. 
  
def findFirstMissing(array, start, end): 
  
    if (start > end): 
        return end + 1
  
    if (start != array[start]): 
        return start; 
  
    mid = int((start + end) / 2) 
  
    # Left half has all elements 
    # from 0 to mid 
    if (array[mid] == mid): 
        return findFirstMissing(array, 
                          mid+1, end) 
  
    return findFirstMissing(array,  
                          start, mid) 
  
  
# driver program to test above function 
arr = [0, 1, 2, 3, 4, 5, 6, 7, 10] 
n = len(arr) 
print("Smallest missing element is", 
      findFirstMissing(arr, 0, n-1)) 