package com.example.learnkotlin

import kotlin.math.max

fun main() {
    println("Hello world!")
    val a: Int = 37
    val b: Int = 40
    val value = largerName(a, b)
    println("larger numer is " + value)
    val value2 = largerName1(a, b)
    println("larger numer1 is " + value2)

}

fun largerName(num1: Int, num2: Int): Int {
    var value = 0
    if (num1 > num2) {
        value = num1
    }
    if (num2 > num1) {
        value = num2
    }
    return value
}

fun largerName1(num1: Int, num2: Int): Int = if (num1 > num2){
    num1
} else{
    num2
}
