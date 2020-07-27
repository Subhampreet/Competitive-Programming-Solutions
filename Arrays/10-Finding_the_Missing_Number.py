# Finding the Missing Number

# You are given a list of n-1 integers and these integers are in the range of 0 to n
# One of the integer is missing in the list.
# There are no duplicates in the list. 
# Write an efficient algorithm to find the missing integer. 

# Input : [1,2,4,6,3]
# Output : 5

# Get the Sum of numbers :  Total = n(n+1)/2
# Subtract all the numbers from sum to get the missing Number


def getMissingNo (A,n):
    total = (n+1)*(n+2)/2
    for i in range(n):
        total -= A[i]
    return total

A = [1,2,4,5,6]
n = len(A)
miss = getMissingNo(A,n)
print("The Missing Number is :",miss)