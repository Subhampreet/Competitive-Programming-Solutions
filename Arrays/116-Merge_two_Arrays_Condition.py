# Merge two sorted array X[]  and Y[] of size m and n each where m>=n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position i array X[] i.e merge (X,Y) keeping the sorted order

# Input:
# X = [0,2,0,3,0,5,6,0,0]
# Y = [1,8,9,10,15]

# Output :
# X = [1,2,3,5,6,8,9,10,15]

def merge(X,Y,m,n):

    # Siz of X is (k+1)
    k = m+n+1

    while m>=0 and n>=0:
        if(X[m]>Y[n]):
            X[k]=X[m]
            m=m-1
        else:
            X[k] = Y[n]
            n = n - 1
        k = k - 1

    # Copy remaining elements of Y to X
    while n>=0:
        X[k] = Y[n]
        k = k - 1
        n = n - 1
    
    # Fill Y with all zeroes
    for i in range(len(Y)):
        Y[i] = 0
    
def rearrange(X,Y):
    k = 0

    # moves non-empty elements in X in the beginning
    # and then merge it with Y
    for i in range(len(X)):
        if X[i]:
            X[k] = X[i]
            k = k+1
    
    # merge X[0..k-1] and Y[0..n-1] to X[0..m-1]
    merge(X,Y,k-1,len(Y)-1)

X = [0,2,0,3,0,5,6,0,0]
Y = [1,8,9,10,15]

rearrange(X,Y)
print(X)