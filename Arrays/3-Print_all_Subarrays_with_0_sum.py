# Given an Array of integers, print all sub-arrays with 0 sum

def printAllSublists(A):
    for i in range(len(A)):
        sum = 0 

        for j in range (i, len(A)):
            sum += A[j]
            if sum == 0:
                print("Sublist", (i,j))

A = [3,4,-7,3,1,3,1,-4,-2,-2]
printAllSublists(A)
