package com.example.myapplication

//Kotlin 循环控制
fun main() {
    val items = listOf("java", "kotlin", "android")
    //for-in
    for (item in items) {
        println(item)
    }
    //forEach
    items.forEach { item ->
        println("forEach:${item}")
    }

    items.forEachIndexed { index, item->
        println("forEachIndexed: ${index},${item}")
    }///11
}