def simpleArraySum(ar,n):
    sum = 0
    for i in range(n):
        sum = sum +ar[i]
    return sum

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = simpleArraySum(ar,n)

    fptr.write(str(result) + '\n')

    fptr.close()