# def gcd(a,b):

#     if(a == 0):
#         return b
#     if(b == 0):
#         return a
    
#     if(a == b):
#         return a
    
#     # a is greater
#     if(a > b):
#         return gcd(a-b , b)
#     return gcd(a, b-a)


# a = 20
# b = 30

# hcf = gcd(a,b)
# print(hcf)


# SOLUTION 2

def gcd(a,b):

    if (b == 0):
        return a 
    return gcd(b, a%b)

a = 30
b = 20
hcf = gcd(a,b)
print(hcf)

