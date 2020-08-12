def getNumberOfdays(month, year):
    # Leap Year
    if(month == 2):
        if((year%400 == 0) or (year%4 == 0 and year%100 != 0)):
            return 29
        else:
            return 28
        
    elif(month == 1 or month == 3 or month == 5 or month ==7 or month ==8 or month == 10 or month == 12 ):
        return 31
    else:
       return 30



month = int(input("Enter Month's Number : "))
year = int(input("Enter the year : "))

days = getNumberOfdays(month , year)

print("Number of days in ",month,"/",year," is : ", days)

