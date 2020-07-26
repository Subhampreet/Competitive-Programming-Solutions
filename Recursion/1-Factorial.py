# Print Factorial of N 

def Fact(n):
    if(n == 0 or n == 1):
        return 1
    else:
        return n*Fact(n-1)

n = int(input("Enter a Number : "))

F = Fact(n)

print("N! = ", F)
