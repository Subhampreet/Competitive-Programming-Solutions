# Find Duplicate element in a limited range Array

# Time Complexity : O(n)

def findDuplicate(A):
    # create visited list of size n+1
    visited = [False]*(len(A)+1)

    #for each elemsnt of the list mark it as visited
    # return the element if it is seen before
    for i in range(len(A)):
        # If element seen before
        if visited[A[i]]:
            return A[i]

        # Mark element as visited
        visited[A[i]] = True

    return -1

A = [1,2,3,4,4,5]

print("Duplicate element is ", findDuplicate(A))