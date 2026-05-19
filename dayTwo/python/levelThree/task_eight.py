number = 1
total = 0
count = 1
while(number != 0):
    number = int(input(f"Enter number {count} (enter 0 to end the loop and get the sum): "))
    count+=1
    total += number
    
print(total)
