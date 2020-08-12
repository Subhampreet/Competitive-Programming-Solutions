def findmax(arr, n):
    for i in range(1,n):
        if(arr[0] < arr[i]):
            arr[0] = arr[i]

    return arr[0]



# Creating a empty list
arr = []

# Number of elements as input
n = int(input("Enter number of Elements : "))

# Iterating till the range
print("Enter ")
for i in range(0, n):
    ele = int(input())

    arr.append(ele) # adding the element

max = findmax(arr , n)
print("Maximum Element in the array is : "max)

