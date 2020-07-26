# Print the Fibonacci value of Nth term

def fib(n):
    if (n == 0):
        return 0
    if (n == 1 or n == 2):
        return 1
    else:
        return fib(n-1)+fib(n-2)

n = int(input(" Enter a Number : "))
F = fib(n)
print(" Fibonacci number is : ", F)