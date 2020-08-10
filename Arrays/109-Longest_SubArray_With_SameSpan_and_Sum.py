# Longest Span with same Sum in two Binary arrays

# Input : arr1[] = {0,1,0,0,0,0}
#         arr2[] = {1,0,1,0,0,1}

# Output : 4
# The longest span with same sum is from 1 to 4

def longestCommonSum(A,B,n):
    maxLen = 0

    for i in range(0,n):
        sum1,sum2 = 0,0
        for j in range(i,n):
            sum1 += A[j]
            sum2 += B[j]

            if (sum1==sum2):
                length = j-i+1
                if(length > maxLen):
                    maxLen = length
    
    return maxLen

A = [0,1,0,0,0,0]
B = [1,0,1,0,0,1]

n = len(A)
M = longestCommonSum(A,B,n)
print(M)