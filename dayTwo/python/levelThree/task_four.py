number = int(input("Enter number to get the multiplication table: "))

for index in range(1, number):
    print(f"{number} x {index} = {number * index}" )
