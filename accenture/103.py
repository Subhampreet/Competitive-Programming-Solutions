n = int(input())

sum1 = int(input())
arr = list(map(int, input().split()))
if(n<2):
    print("-1")
arr = sorted(arr)
for i in range(n-1):
    if(arr[i]+arr[i+1] < sum1):
        print(arr[i]*arr[i+1])
        break
else:
    print('0')