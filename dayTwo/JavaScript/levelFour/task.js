function add(num1, num2){
    return num1 + num2;
} 

console.log(add(1, 1));


//=============================================================================

function evenOrOdd(number){
    if (number % 2 == 0){
        return "even";
    } else return "odd";
}
       
console.log(evenOrOdd(11))


//=============================================================================

function square(number){
    return number * number;
}

    
console.log(square(10))

//=============================================================================

function toFerenheit(celsius){
    return (celsius * 9 / 5) + 32;
}
console.log(toFerenheit(10))

//=============================================================================


//function prime(number){
//
//    let check = true;
//    let count = 2;
//    while (count <= Math.floor(number/2)){
//        if (number % count == 0){
//            check = false
//            count+=1
//        }
//    }
//    return check
//}    
//console.log(prime(10))

// UNSURE


//=============================================================================


function largestThree(num1, num2, num3){

    let largest = num1
    if (num2 > largest)largest = num2;
    else if (num3 > largest) largest = num3;
    return largest
}
    
console.log(largestThree(100, 21, 300));


//=============================================================================


function simpleInterest(principal, rate, time){

    return (principal * rate * time) / 100
}
    
console.log(simpleInterest(10, 10, 10))

//=============================================================================

function areaOfRectangle(length, breadth){
    
    return length * breadth
}
    
console.log(areaOfRectangle(10, 10))

//=============================================================================

function reverseDigit(number){

    let reverseDigit;
    let eachDigit;	
    
    while(number > 0){
        eachDigit = number % 10;
        reverseDigit = (reverseDigit * 10) + eachDigit;
        number = Math.floor(number / 10)   
    }

    return reverseDigit
}

console.log(reverseDigit(123))

























