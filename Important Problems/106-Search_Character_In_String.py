def findIndex(str, ch):
    ln = len(str)
    F = []
    for i in range(0,ln):
        if(str[i]==ch):
            F.append(i)
    F.sort(reverse=True)
    print(F[0])


str = input("Enter a string : ")
ch = input("Enter the character to be searched : ")

findIndex(str, ch)



