package com.example.myapplication

//条件控制
fun main() {
    println("maxOf: ${maxOf(5, 10)}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    //三目运算
    return if (a > b) a else b
}

fun eval(number: Number) {
    //is 是判断是否是某一种类型
    if (number is Int) {
        println("this is int number")
    } else if (number is Double) {
        println("this is double number")
    } else if (number is Float) {
        println("this is Float number")
    } else if (number is Short) {
        println("this is Short number")
    } else {
        throw IllegalAccessException("invalid argument")
    }
}

//when 是带有返回值的
//when 将它的参数与所有的分支条件顺序比较，直到某个分支满足条件
fun eval2(number: Number): String = when (number) {
    200f -> "the number is 200f"
    is Int -> "this is int number"
    is Double -> "this is Double number"
    is Float -> "this is float number"
    is Long -> "this is byte number"
    else -> "invalid number"
}
