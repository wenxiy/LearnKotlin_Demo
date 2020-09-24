package com.example.learnkotlin

open class Person {
    var name =""
    var age = 0
    fun eat(){
        println(name+"is eating.He is"+age+"year old.")
    }
}
fun main(){
    val p =Person()
    p.name="Jack"
    p.age= 19
    p.eat()

}