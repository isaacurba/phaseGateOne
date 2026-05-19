number = int(input("Enter number to get the sum from 1 to that number: "))
total = 0

for index in range(1, number+1):
    total = total + index
    
print(total)
