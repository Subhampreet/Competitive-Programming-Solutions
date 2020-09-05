def find_gcd(a,b):
    if(a == 0):
        return b
    return find_gcd(b % a, a)

def digitGCD(n):

    gcd = 0
    while (n > 0):

        gcd = find_gcd(gcd , n % 10)

        if (gcd == 1):
            return 1
        
        n = n // 10

    return gcd

n = 2448
print(digitGCD(n))
