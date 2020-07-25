#Given an unsorted array of integers, find a pair with given sum in it

#for example:

    # Input:

    # arr = [8,7,2,5,3,1]
    # sum = 10

    # Output:

    # Pair found at index 0 and 2 (8+2)
    # or
    # Pair found at index 1 and 4 (7+3)

# NAIVE APPROACH (Time Complexity : O(n^2))

def find (A, sum):
    for i in range (len(A)-1):
        for j in range (i+1, len(A)):
            if(A[i]+A[j]==sum):
                print("Pair found at index ", i, "and", j)
                return
    
    print("Pair Not Found")

A = [8,7,2,5,3,1]
sum = 10

find(A, sum)

#SOLUTION USING SORTING (Time Complexity : O(nlog(n)))

def find(A, sum):
    A.sort()
    low = 0
    high = len(A)-1

    while low < high :
        if A[low]+A[high]==sum:
            print("Pair Found")
            return
        
        if A[low]+A[high]<sum:
            low= low + 1 

        else:
            high = high - 1

    print("Pair Not Found")