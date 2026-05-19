num1  = int(input("Enter number 1: "))
num2  = int(input("Enter number 2: "))
num3  = int(input("Enter number 3: "))

largest = num1

if num2 > largest:
    largest = num2
    print(largest)
elif num3 > largest:
    largest = num3
    print(largest)
else: print(largest)
