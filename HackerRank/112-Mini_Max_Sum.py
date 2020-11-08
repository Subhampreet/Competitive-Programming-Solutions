import math
import os
import random
import re
import sys


def miniMaxSum(arr):
    arr.sort()
    mins=sum(arr[0:4])
    maxs=sum(arr[1:5])
    print(mins, maxs)
    



if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)