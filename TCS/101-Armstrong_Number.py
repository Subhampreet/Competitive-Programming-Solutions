# Input : 153
# Output : Yes
# 153 is an Armstrong number.
# 1*1*1 + 5*5*5 + 3*3*3 = 153

# Input : 1253
# Output : No
# 1253 is not a Armstrong Number
# 1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

# Input : 1634
# Output : Yes
# 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634


def power(x,y):
    if y == 0:
        return 1
    if y % 2 == 0:
        return power(x,y//2)*power(x,y//2)
    return x*power(x,y//2)*power(x,y//2)


def order(x):
    n = 0
    while (x!=0):
        n = n + 1
        x = x//10
    return n

def isArmstrong(x):
    n = order(x)
    temp = x
    sum1 = 0
    while(temp != 0):
        r = temp % 10
        sum1 = sum1 + power(r,n)
        temp = temp//10

    return(sum1 == x)

x = int(input(" Enter a Number : "))
print(isArmstrong(x))