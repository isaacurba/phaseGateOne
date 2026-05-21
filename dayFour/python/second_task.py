def remove_duplicate(arr):
    count = 0
    result = []
    for index in range(0, len(arr)):
        isDuplicate = False
        for secondIndex in range(0, len(arr)):
            
            if index == secondIndex:
                continue
            if arr[index] == arr[secondIndex]:
                isDuplicate = True
                break
      
        if not isDuplicate:
            result.append(arr[index])
            count += 1
    return result

