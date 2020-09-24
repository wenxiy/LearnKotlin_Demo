package com.example.learnkotlin

class Student(val sno: String, val grade: Int): Person(){
    init {
        println("sno is"+sno )
        println("Int is "+ grade)

    }
    constructor():this("",0) 
}