# Finding Sum of N natural Numbers using Recursion

def Sum(n):
    if(n == 0):
        return 0
    else:
        return Sum(n-1)+n

n = int(input("Find Nth natural number : "))
S = Sum(n)
print("Sum of first", n ,"natural number is :",S)