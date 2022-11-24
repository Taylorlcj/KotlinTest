package com.example.kotlinbasics
/* mutli-line
comment */

fun main(){
    var myName = "Taylor" //var can be overridden; val cannot
    myName = "Thomas"
    print("Hello " + myName)

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
    print("\nFirst Character: " + firstCharStr)
    print("\nLast Character: " + lastCarStr)



}

