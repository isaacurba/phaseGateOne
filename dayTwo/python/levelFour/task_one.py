def add(num1, num2):
    return num1 + num2

print(add(1, 1));

#==================================================================

def evenOrOdd(number):
    if number % 2 == 0: return "even"
    else: return "odd"
       
print(evenOrOdd(11))


#==================================================================

def square(number):
    return number * number
    
print(square(10))


#==================================================================

def toFerenheit(celsius):
    return (celsius * 9 / 5) + 32

print(toFerenheit(10))


#==================================================================

def prime(number):
    check = True
    count = 2
    while count <= number//2:
        if number % count == 0:
            check = False
        count+=1
    return check
    
print(prime(10))

#==================================================================


def largestThree(num1, num2, num3):
    largest = num1
    if num2 > largest:
        largest = num2
    elif num3 > largest:
        largest = num3
        
    return largest
    
print(largestThree(100, 21, 300))


#==================================================================

def simpleInterest(principal, rate, time):
    return (principal * rate * time) / 100
    
print(simpleInterest(10, 10, 10))


#==================================================================

def areaOfRectangle(length, breadth):
    return length * breadth
    
print(areaOfRectangle(10, 10))


#==================================================================

def reverseDigit(number):
    reverseDigit = 0
    while(number > 0):
        eachDigit = number % 10
        reverseDigit = (reverseDigit * 10) + eachDigit
        number //= 10    
    return reverseDigit

print(reverseDigit(123))


#==================================================================

#def countMostOccur(word):
#    char = []
#    for letter in word;
#        char[letter] = letter
#    
#    if lett
        
#UNSURE









































