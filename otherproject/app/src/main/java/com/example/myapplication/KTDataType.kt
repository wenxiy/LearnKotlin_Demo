package com.example.myapplication

fun main() {
    // 1. 声明基本数据类型变量
    //默认数据类型为Int
    val number = 100; //根据赋值推断
    val bigNumber =8000000000 //超过了Int最大值，编译器升级为long
    //在赋值数字后面加上L，自动推断为Long类型
    val longNumber = 20L
    //浮点类型
    //编辑器同样根据赋值进行判断
    val doubleNumber : Double = 3.1415928888
    val floatNumber = 3.1415928888f // 小数位只能保存6位 单精度
    //字符类型 赋值用单引号引起来
    val char : Char = '0'
    //布尔类型：使用Boolean 或者编辑器自己推断
    val isVisible = false
    //字符串类型 双引号印出来
    val str: String = "1234567890"
    //字符串的取值
    val strNumber : Char = str[1]
    //字符串的模板表达式 以$开始
    println("The Result is $str")
}