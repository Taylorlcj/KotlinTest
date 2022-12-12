package com.example.kotlinbasics

fun main() {
    val result = addUp(5,3)
    println("result is $result")
    val avg = average(5.3,13.37)
    println("result is $avg")
}
//Method - a function within a class
// Parameters (input)
fun addUp(a: Int, b: Int,) : Int{
    return a + b
}

fun average(a: Double, b: Double,) : Double{
    return (a + b) / 2
}
fun myFunction(){
    println("Called from myFunction")
}

//Nullables??????