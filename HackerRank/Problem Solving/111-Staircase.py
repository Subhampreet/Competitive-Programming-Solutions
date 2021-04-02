import math
import os
import random
import re
import sys


def staircase(n):
    for f in range(1,n+1):
        print(("#"*f).rjust(n)) 

if __name__ == '__main__':
    n = int(input())

    staircase(n)