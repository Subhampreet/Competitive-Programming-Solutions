# Find Maximum Number of Sub-Array having equal number of 0's and 1's
# Input : {0,0,1,0,1,0,0}
# Output subarray is {0,1,0,1} or {1,0,1,0}

def maxLenSublist(A):
    # Create an empty Hash Map to store index of first Sublist having some sum
    dict = {}

    dict[0] = -1
    # Length stores maximum length of sublist with sum 0
    length = 0
    # stores ending index of maximum length sublist having sum 0
    ending_index = -1

    sum = 0

    for i in range(len(A)):
        # Sum of elements so far (replace 0  with -1)
        sum += -1 if(A[i] == 0) else 1
        # If Sum is seen Before
        if sum in dict:
            # Update length and ending index of maximum length
            if length<i-dict.get(sum):
                length = i-dict.get(sum)
                ending_index = i

            # If Sum is seen for first time, insert sum with its index into the dict
            else:
                dict[sum]=i

        if ending_index != -1:
            print((ending_index-length+1, ending_index))
        else:
            print("No Sublist exists")

A = [0,0,1,0,1,0,0]
maxLenSublist(A)