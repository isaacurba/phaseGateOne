number = int(input("Enter number to get the factorial: "))
factorial = 1

for index in range(1, number+1):
    factorial = factorial * index

print(factorial)
