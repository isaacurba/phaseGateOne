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




