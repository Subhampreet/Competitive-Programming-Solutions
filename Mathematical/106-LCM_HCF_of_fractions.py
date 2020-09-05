# LCM of A/B and C/D = (LCM of A and C) / (HCF of B and D)

# Python3 def program to find LCM of 
# array of fractions 
  
# Recursive function to  
# return gcd of a and b  
def gcd(a, b): 
   
    # Everything divides 0  
    if (a == 0):  
        return b;  
    if (b == 0):  
        return a;  
      
    # base case  
    if (a == b):  
        return a;  
      
    # a is greater  
    if (a > b):  
        return gcd(a - b, b);  
    return gcd(a, b - a);  
      
# Function that will calculate 
# the Lcm of Numerator 
def LCM(num, N): 
  
    ans = num[0]; 
    for i in range(1,N): 
        ans = (((num[i] * ans)) / (gcd(num[i], ans))); 
    return ans; 
  
  
# Function that will calculate 
# the HCF of Denominator 
def HCF(den, N): 
  
    ans = den[0];  
    for i in range(1,N): 
        ans = gcd(den[i], ans);  
    return ans; 
  
  
def LCMOfFractions(num, den, N): 
  
    Numerator = LCM(num, N); 
    Denominator = HCF(den, N); 
  
    gcd1 = gcd(Numerator, Denominator); 
  
    Numerator = int(Numerator / gcd1); 
    Denominator = int(Denominator / gcd1); 
  
    print("LCM is =",Numerator,"/",Denominator); 
  
# Driver code 
num = [1, 7, 4 ]; 
den = [2, 3, 6 ]; 
N = len(num); 
LCMOfFractions(num, den, N);    


