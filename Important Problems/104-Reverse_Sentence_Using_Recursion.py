# def reverseSentence(string):
#     ln = len(string)

#     if (ln == 1):
#         return string
#     else:
#         return reverseSentence(string[1:]) + string[0]


# string = input("Enter a String : ")

# rev = reverseSentence(string)

# print(rev)


#  Method - 2

def reverse(str):

    s = ""
    for ch in str:
        s = ch + s
    return s

str = "Subhampreet"

print(reverse(str))



