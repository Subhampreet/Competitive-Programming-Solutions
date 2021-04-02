def aVeryBigSum(ar,n):
    plus = 0
    for i in range(n):
        plus = plus + ar[i]
    print (plus)



n = int(input())

ar = list(map(int, input().rstrip().split()))

aVeryBigSum(ar,n)