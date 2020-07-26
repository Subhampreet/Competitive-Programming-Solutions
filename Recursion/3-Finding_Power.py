# Find m^n using Recursion

def Power(m,n):
    if(n == 0):
        return 1
    else:
        return pow(m,n-1)*m

m = int(input("Enter Base Number : "))
n = int(input("Enter Power Number(Positive Integer) : "))

P = Power(m,n)
print(m,"^",n,"=",P)