# A majority element in an array A[] of size n is an element that appears more than n/2 times(and hence there is only one such element).

# Input : [3,3,4,2,4,4,2,4,4]
# Output : 4

# Moore's Voting Algorithm




def findCandidate(A,n):
    maj_index = 0
    count = 1
    for i in range(n):
        if(A[maj_index]==A[i]):
            count+=1
        else:
            count-=1
        if(count == 0):
            maj_index = i
            count = 1
    
    return A[maj_index]

def printMajority(A,n):
    cand = findCandidate(A,n)
    if(isMajority(A,n,cand)):
        print(cand," ")
    else:
        print("NO MAJORITY ELEMENT FOUND")

def isMajority(A,n,cand):
    i,count = 0,0
    for i in range(n):
        if(A[i]==cand):
            count+=1
        if(count > n/2):
            return 1
        else:
            return 0


A = [4,4,4,4,4,4,4]
n = len(A)
printMajority(A,n)



