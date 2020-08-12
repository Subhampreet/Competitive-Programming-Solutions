def removeNum(str):
    temp = ""
    for ch in str:
        if(ch>="A" and ch<="Z") or (ch>="a" and ch<="z"):
            temp = temp + ch

    return temp

str = input("Enter a String of characters : ")

str = removeNum(str)

print(str)
