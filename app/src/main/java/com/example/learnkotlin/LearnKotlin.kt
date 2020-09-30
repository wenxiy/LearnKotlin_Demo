package com.example.learnkotlin

import kotlin.math.max

fun main() {
    val list = listOf("Apple","Banana","Orange","Pear","Grape")
    for (fruit in list){
        println(fruit)
    }

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

fun largerName1(num1: Int, num2: Int): Int = if (num1 > num2) {
    num1
} else {
    num2
}

fun getScore(name: String) = if (name == "Tom") {
    86
} else if (name == "Jim") {
    77
} else if (name == "Jack") {
    95
} else if (name == "Lily") {
    100
} else {
    0
}

/**
 * when和if一样，是可以拥有返回值的。而且对于When来说，也是可以写在语法糖中的。以下这个例子是
 * kotlin的精确匹配
 */
fun getScore2(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun checknum() {
    for (i in 0..10)
        println(i)
    var d: Int = 19
    for (d in 19..25)
    {
        println(d)
    }

}