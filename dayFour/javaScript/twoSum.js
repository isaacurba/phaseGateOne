export const targettingSum = (arr, target) {
    
    result = [0, 0];

    for (let index = 0; index < arr.length; index++) {
        
        for (let secondIndex = index + 1; secondIndex < arr.length; secondIndex++) {
          
            if (arr[index] + arr[secondIndex] == target) {
                result[0] = arr[index];
                result[1] = arr[secondIndex];
            }
        }
    }
    return result;
}


