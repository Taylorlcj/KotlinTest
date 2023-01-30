package com.example.kotlinbasics

import java.util.*

fun main(){
    var name :String = "Taylor"
    var nullableName : String? = "Taylor"   //The ? makes it a nullable which allows it to be re-declared as a null
//    nullableName = null

    var len = name.length

    //version 1
//    if(nullableName != null){
//        var len2 = nullableName.length
//    }
//    else{
//        null
//    }

    //version2
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    //Elvis Operator
    val name2 = nullableName ?: "Guest"
    println("name is $name")
    println(nullableName!!.toLowerCase())
}