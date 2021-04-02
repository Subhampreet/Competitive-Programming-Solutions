import math
import os
import random
import re
import sys

# Complete the birthdayCakeCandles function below.
def birthdayCakeCandles(ar,n):
    m = max(ar)
    count = 0
    for i in range(n):
        if(ar[i]==m):
            count+=1
    print (count)



n = int(input())

ar = list(map(int, input().rstrip().split()))

birthdayCakeCandles(ar,n)
