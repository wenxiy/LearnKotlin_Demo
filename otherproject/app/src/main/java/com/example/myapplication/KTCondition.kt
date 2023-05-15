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
    return if (a > b) a else b
}

