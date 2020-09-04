# a * b = lcm(a,b) * gcd(a,b)

def gcd(a,b):
    if (b == 0):
        return a
    return gcd(b, a % b)

def lcm(a,b):
    return (a*b) / gcd(a,b)

a = 30
b = 20
print(lcm(a,b))

