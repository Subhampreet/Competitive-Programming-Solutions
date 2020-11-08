def compareTriplets(a, b):
    n = len(a)
    alice=0
    bob = 0
    for i in range (n):
        if (a[i]>b[i]):
            alice+=1
        elif(a[i]<b[i]):
            bob+=1
    print(alice, bob)



a = list(map(int, input().rstrip().split()))

b = list(map(int, input().rstrip().split()))

compareTriplets(a, b)