# In-place merge two sorted arrays

# Input : X = [1,4,7,8,10]
#         Y = [2,3,9]

# Output : X = [1,2,3,4,7]
#          Y = [8,9,10]

def merge(X,Y):
    m = len(X)
    n = len (Y)

    for i in range(m):
        
        if(X[i]>Y[0]):
            # Swap (X[i], Y[0])
            temp = X[i]
            X[i] = Y[0]
            Y[0] = temp
        
            first = Y[0]

            k = 1

            # move Y[0] to its correct position to maintain sorted order of Y. Note : Y[1...n-1] is already sorted.
            while k < n and Y[k] < first:
                Y[k-1] = Y[k]
                k = k + 1

            Y[k-1] = first

X = [1,2,3,4,7]
Y = [8,9,10]

merge(X,Y)

print("X : ",X)
print("Y : ",Y)



