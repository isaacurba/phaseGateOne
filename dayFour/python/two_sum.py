def targeting_sum(arr, target):
    result = []
    for index in range(0, len(arr)):
        for secondIndex in range(1, len(arr)):
            if arr[index] + arr[secondIndex] == target:
                result.append(arr[index])
                result.append(arr[secondIndex])
                return result 
    return result

