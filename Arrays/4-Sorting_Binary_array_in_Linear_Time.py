# Given an binary array, sort it in linear time and constant space. Output should print contain all zeroes followed by all ones

# Input: {1,0,1,0,1,0,0,1}
# Output: {0,0,0,0,1,1,1,1}

def sort(A):

    k = 0
    for i in range(len(A)):
        if A[i] == 0:
            A[k] = 0 
            k = k + 1
    
    for i in range (k, len(A)):
        A[k] = 1
        k = k + 1

    print(A)

A = [0,0,1,0,1,0,1,1,0]

sort(A)