package com.example.myapplication

//kotlin Lambda
fun main() {
    //普通成员方法声明与调用
    //需要先构建出实例对象，才能访问成员王法
    //实例对象的构建只需要在类名后面加上()
    //Person() = java中new关键字
    Person().test()

    //静态类里面的方法，都是静态方法
    //不需要构建实例对象，可以通过类名，直接访问静态方法
    val result = NumUtil.double(1)
    println("result: $result") //字符串表达式可以去除花括号
}

//普通类方法
class Person {
    fun test() {
        println("成员方法")
    }
}

//静态类的方法
//如果我们想实现一个工具util的话，可以借助关键字object来创建一个静态类
object NumUtil {
    fun double(num: Int): Int {
        return num * 2
    }
}