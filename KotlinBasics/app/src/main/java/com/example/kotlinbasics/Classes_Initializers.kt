package com.example.kotlinbasics

fun main(){
    var denis: Person = Person("Tayor", "Jensen")
}

class Person (firstName: String, lastName: String){

    init {
        println("Person Created") //initialized a new person object
    }
}