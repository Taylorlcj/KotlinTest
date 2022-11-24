package com.example.kotlinbasics
/* multi-line
comment */

fun main(){
    var myName = "Thomas" //var can be overridden; val cannot
    myName = "Taylor"
    println("Hello $myName") //the $ prevents the need for the + sign

    //Integers
    val myByte: Byte = 13                           //8 bit

    val myshort: Short = 125                        //16 bit

    val myInt: Int = 123123123                      //32 bit(this is automatically assumed)

    val nyLong: Long = 12_039_812_309_487_120        //64 bit

    //floating point numbers
    val myFloat: Float = 13.37F                     //32 bit and faster
    val myDouble: Double = 3.1415926535893237       //64 bit and slower, but more standard

    //Booleans(true or false)
    var isSunny = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '$'

    //Strings
    val myStr = "Hello World"
    val firstCharStr = myStr[0]
    val lastCarStr = myStr[myStr.length - 1]

    println("First Character: $firstCharStr and the length of myStr is ${myStr.length}")
    println("Last Character: " + lastCarStr) //this is without using the $, much more tedious
    println("Hello my name is $myName and I love to sing!")


    //Arithmetic Operator(+, -, *, /, %)
    var result = 5+3
    result /= 2
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a/b
    println(result)
    println(resultDouble)

    //Comparison operators(==, !=, <, >, <=, >=)
    val isEqual = 5==3                      //compares the values and determines true or false
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 <= 3}")

    //increment and decrement(++, --)

    //if statements(numbers)
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }
    else if(heightPerson1 == heightPerson2){
        println("Use technique")
    }
    else{
        println("run away")
    }

    //if statements(strings)
    var name = "Bob"
    if (name == "Bob"){
        println("Welcome home Bob")
    }
    else{
        println("Wait, you're not Bob!!")
    }


}

