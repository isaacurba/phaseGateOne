function replaceNegative(arr){

    removeNegative = arr.length;
    
    for(let index = 0; index < arr.length; index++){
        removeNegative[index] = arr[index];
        if (removeNegative[index] < 0){
            removeNegative[index] = 0;
        }
    }
    return removeNegative;
}

arr = [5, -9, 3, -6, 2, -11];

console.log(replaceNegative(arr));
