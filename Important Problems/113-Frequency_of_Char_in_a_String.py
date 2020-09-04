def freqCount(str, ch):
    count = 0
    ln = len(str)
    for i in range (0,ln):
        if(str[i]==ch):
            count+=1
    return count

str = input("Enter a String : ")
ch = input("Enter a Character : ")
R = freqCount(str,ch)
print(R)