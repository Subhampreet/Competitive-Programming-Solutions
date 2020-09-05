# Input : [1,2,3,2,3,1,3]
# Output : 3

# XOR Operattion : 

# A ^ A = 0
# A ^ 0 = A

def getOdd(A,n):

    res = 0
    for i in range(n):
        res = res ^ A[i]

    return res

A = [2,3,5,4,5,2,4,3,5,2,4,4,2]
n = len(A)

print(getOdd(A,n))


