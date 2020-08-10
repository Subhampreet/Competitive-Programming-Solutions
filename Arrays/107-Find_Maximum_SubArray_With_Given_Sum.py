# Given an array of Integers, find Maximum length sub-array having given Sum
# A = {5,6,-5,5,3,5,3,-2,0}
# Sum = 8
# Sub-arrays with sum 8 are :
# {-5,5,3,5},{3,5},{5,3}
# Output : {-5,5,3,5} MAX Length = 4

def maxLengthSublist(A,S):
    # length stores the maximum length of sublist with sum S
    length = 0
    # Stores ending index of maximum length sublist having sum S
    ending_index = -1

    # Consider all sublists starting with i
    for i in range(len(A)):
         sum = 0

         # Consider all sublist ending with j
         for j in range(i,len(A)):
             # Sum of all elements in the current Sublist
             sum += A[j]

             if sum == S:
                 # Update length & ending index of maximum length sublist
                 if length < j-i+1:
                     length = j-i+1
                     ending_index = j
    print((ending_index-length+1, ending_index))

A = [5,6,-5,5,3,5,3,-2,0]
sum = 8

maxLengthSublist(A , sum)