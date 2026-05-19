number = int(input("Enter number to count how many digit it has: "))
copy = number

count = 0
while (number != 0):
    eachDigit = number % 10
    number //= 10
    count+=1
    
print(f"{copy} has {count} digit")

