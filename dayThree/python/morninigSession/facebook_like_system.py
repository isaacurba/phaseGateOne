def countLikes(arr):
    likes = ""
    for index in range(0, len(arr)):
   
        if (arr[0] == ""):
            likes = "no one likes this"
        elif (len(arr) == 1 ):
            likes = arr[index] + " likes this"
        elif(len(arr) == 2):
            likes = arr[0] + " and " + arr[1] + " likes this"
        elif (len(arr) == 3):
            likes = arr[0] + ", " + arr[1] + " and " + arr[2] + " likes this"  
        else:
            likes = arr[0] + ", " + arr[1] + " and " + len(arr) + " others likes this"
    
    return likes   
    
arr = ["peter", "alex", "mark", "max", "john", "ricky"]

print(countLikes(arr))

