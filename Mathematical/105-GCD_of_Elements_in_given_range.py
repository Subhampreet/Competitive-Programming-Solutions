# if a = b : the segment consists of a single number, hence the answer is a.
# if a < b : we have gcd(n, n + 1, n?+ 2, …, m) = gcd(gcd(n, n + 1), n + 2, …, m) = gcd(1, n + 2, …, n) = 1.

def rangeGCD(n,m):
    return n if(n == m) else 1

n , m = 210, 210
print(rangeGCD(n,m))