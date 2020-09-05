# The GCD of three or more numbers equals the product of the prime factors common to all the numbers, but it can also be calculated by repeatedly taking the GCDs of pairs of numbers.

def find_gcd(a,b):
    if(a == 0):
        return b
    return find_gcd(b % a, a)

l = [2,4,6,8,16]

num1 = l[0]
num2 = l[1]

gcd = find_gcd(num1,num2)

for i in range(2,len(l)):
    gcd = find_gcd(gcd,l[i])

print(gcd)