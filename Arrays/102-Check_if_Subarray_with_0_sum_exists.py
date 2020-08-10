# Given an array of Integers, check if array contains a subarray having 0 sum.

# Input: {3,4,-7,3,1,3,-4,-2,-2}
# Output: Subarray with 0 sum exists

# Time Complexity 0(n)

def zeroSumCheck(A):
    # Create an empty set to store sum of elements of each
    # sublist A[0..i] where 0<= i <len(A)
    s = set()
    # Insert 0 into the set to handle the case when sublist with
    # 0 sum starts from index 0
    s.add(0)

    # traverse the given list
    for i in A:
        #sum of elements so far
        sum+=i

        # if sum is seen before, we have found a sublist with 0 sum
        if sum in s:
            return True
        # insert sum so far into set
        s.add(sum)

    return False

A = [4,-6,3,-1,4,2,7]

if zeroSumCheck(A):
    print("Sublist exists")
else:
    print("Sublist do not exist")