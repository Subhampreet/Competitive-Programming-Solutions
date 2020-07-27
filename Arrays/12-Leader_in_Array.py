# Leaders in an Array 
# An element is leader if it is greater than all elements to its right side. And the rightmost element is always a Leader.

# Input : [16,17,4,3,5,2]
# Ouput : Leaders are 17, 5, 2.

def printLeaders(A,n):
    for i in range(n):
        for j in range(i+1,n):
            if(A[i]<=A[j]):
                break
        # The loop didn't break    
        if(j == n-1): 
            print(A[i], " ")


A = [16,17,4,3,5,2]
n = len(A)

printLeaders(A,n)