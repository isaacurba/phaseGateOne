space = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,]
    
def park(number):

    message = "slot is taken"
    if (space[number - 1] == 0):
        space[number - 1] = 1
        message = "car added successfully"
    
    return message


def remove(number):
    message = "slot is free"
    if (space[number - 1] == 1):
        space[number - 1] = 0;
        
        message = "car removed successfully"
    
    return message;


def slot():
    return print(space)



def option():
    print("1. enter carping slot for where you want to park.")
    print("2. enter number you want to remove parking slot.")
    print("2. enter number you want to remove parking slot.")    
active = True
    
while active:
    number = int(input(option()))
    park(number)
    slot()
    
    
    
    
    
    
    
    
    
    
    
 
