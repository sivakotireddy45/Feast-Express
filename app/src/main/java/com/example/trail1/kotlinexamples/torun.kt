package com.example.trail1.kotlinexamples

fun main() {
    println("hello world")
    var myStudent: Student = Student (name = "sathvik" , age = 20, address = "hyd")
    println(myStudent.name)
    myStudent.name= "gade"
    println(myStudent.name)
}