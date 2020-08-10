# Sort an array of 0's, 1's and 2's

# Input : {0,1,2,2,1,0,0,2,0,1,1,0}
# Output : {0,0,0,0,0,1,1,1,1,2,2,2,}

def swap(A,i,j):
    temp = A[i]
    A[i] = A[j]
    A[j] = temp

def threeWayPartition(A, end):
    start = mid = 0
    pivot = 1

    while mid <= end :
        if (A[mid]<pivot): # current element is 0
            swap(A,start,mid)
            start += 1
            mid += 1
        elif A[mid]>pivot: # current element is 2
            swap(A,mid,end)
            end-=1
        else:               #current element is 1
            mid = mid + 1

A = [0,1,2,2,1,0,0,2,0,1,1,0]
threeWayPartition(A , len(A)-1)
print(A)
