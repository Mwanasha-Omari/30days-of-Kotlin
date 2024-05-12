fun main(){
println(getNumber(listOf(1,2,3,45),20))
    println(getTotal(listOf(2,4,6,8,10,45,54)))
    println(findMinAndMax(listOf(2,4,8,10,32,40,1,0)))
println(checkCharacter('b'))
    println(checkPrimeNumber(13))
    println(checkYear(2020))
    println(getNumber(listOf(3,5,15,4,3,4,67,89,-1)))

}
// Write a program that iterates through numbers from 1 to a given limit (e.g., 100).
// For each number: If the number is divisible by 3, print ""Fizz"".
// If the number is divisible by 5, print ""Buzz"".
// If the number is divisible by both 3 and 5, print ""FizzBuzz"".
// Otherwise, print the number itself.
//
// #  process
// # iterate through the numbers to get all the numbers
// # if its divisible by both 3 and 5,3 or 5

// # output
// # if the number is divisible by both three and 5
// # it should print out fizzbuzz
// # if the number is divisible by 3 it should print out fizz
// # if the number is divisible by 5 it should print out buzz






fun getNumber(num: List<Int>){
  var num=1..100
for (number in num){
    if (number % 3==0 && number%5==0){
    println("FizzBuzz")
}
    else if (number % 3==0){
        println("Fizz")

    }
    else if (number % 5==0){
        println("Buzz")

    }

}}











// Write a program that takes a number as input and determines if it's prime.
//      input
//  number
//   process
//    checking if the number is less than one it should print
//  out the number is not a prime number
//  if the number is divisible by 3 and not divisible by two the
//   number is a prime number
//   else the number should be invalid
//  output
//  prime number
//  not a prime number
//  nimber is not valid

fun checkPrimeNumber(num:Int){
if(num<1){
    println("$num is not a prime number")
}

if(num%2!=0 && num%3==0){
println("$num is a prime number")
}

}



// # input
// #    year
// #  process
// #  checking if the year is divisible by 4
// # checking if the year is divisible by 400
// # checking if the year is divisible by 100

// # output
// #  if the number is divisible by 100 400 and 4
// # print its a leap year
// # else it is not a leap year



// "Write a program that takes a year as input. Check if the year is a leap year based on the following rules:
// A year is a leap year if it is divisible by 4 but not by 100.
// However, if the year is divisible by 100, it must also be divisible by 400 to be considered a leap year."
fun checkYear(year:Int){
if(year%4==0)
    if(year%400==0)
        if(year%100==0){
            println("$year is a leap year ")
        }
    else{
        println("$year is a leap year ")
        }
    else{
        println("$year is a leap year ")

    }
else{
    println("$year is not a leap year ")

}

}

//  # input
//  #character

// #  process
// # iterating through the list of vowels checking if the character is a vowel or a consonant
// # cecking if the character is in the vowels

// # output
// # if the character is in the list of vowel print out
// # character is a vowel
// # else it should print out the character is a consonant


// Write a program that takes a character as input. Check if the character is a vowel (a, e, i, o, u) and display "Vowel" or "Consonant" accordingly.
fun checkCharacter(x:Char){
var vowels= arrayOf('a','e','i','o','u')
for (x in vowels)
  if(vowels.contains(x)){
println("$x is a vowel")
  }
    else{
      println("$x is a consonant")

  }

}



// # input
// #   list of numbers
// #  process
// # sort the numbers in an ascending order

// # output
// # maximum and minimum number

// Write a program that takes an array of numbers as input and finds the minimum and maximum elements.
fun findMinAndMax(num:List<Int>){
 var sortedNum=num.sorted()
 println(sortedNum)
  var max=num.max()
    println(max)
    var min=num.min()
    println(min)

}


// Write a program that takes an array of numbers as input and calculates the sum of all elements.
// # input
// # a list of numbers
// #  process
// # adding each number in the list and getting the total
// # output
// # sum of the numbers in the list



fun getTotal(nums:List<Int>){
    var sum=0
    for(i in nums)
        sum+=i
println(sum)
}


// Write a program that takes an array and a number as input and checks if the number exists in the array.

// # input
// #   list of numbers and a number

// #  process
// #  checking if the number is in the array
// # output
//     #  the number exists in the array

fun getNumber(numbers:List<Int>,number:Int){
for(i in numbers)
    if(i==number){
println("$number exists in numbers ")
    }
    else{
        println("$number does not exist in numbers")
    }
}