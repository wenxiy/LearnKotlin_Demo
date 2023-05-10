package com.example.myapplication

import kotlinx.coroutines.processNextEventInCurrentThread

fun main() {
    // 1. 声明基本数据类型变量
    //默认数据类型为Int
    val number = 100; //根据赋值推断
    val bigNumber = 8000000000 //超过了Int最大值，编译器升级为long
    //在赋值数字后面加上L，自动推断为Long类型
    val longNumber = 20L
    //浮点类型
    //编辑器同样根据赋值进行判断
    val doubleNumber: Double = 3.1415928888
    val floatNumber = 3.1415928888f // 小数位只能保存6位 单精度
    //字符类型 赋值用单引号引起来
    val char: Char = '0'
    //布尔类型：使用Boolean 或者编辑器自己推断
    val isVisible = false
    //字符串类型 双引号印出来
    val str: String = "1234567890"
    //字符串的取值
    val strNumber: Char = str[1]
    //字符串的模板表达式 以$开始
    println("The Result is $str")
    println("The text length is ${str.length}")
    //转义字符串
    val helloWord = "Hello world!\n"
    println(helloWord)
    //
    val Jsonform = "{\"key\":\"value\"}"
    print(Jsonform)
    //"""分解符，字符串内容无需转义，看起来清爽
    val helloworld4 = """
        Tell me and I forget.
        Teach me and I remember
        {"key1": "value1"}
        {"key2": "value2"}
        """.trimIndent()
    println(helloworld4)
    //数据类型间强制转化
    val number100 = 100
    println("转化成string${number100.toString()}")
    // 数据类型的加减乘除
    //整数除以整数就是整数 整数除以小数就是小数
    //位操作
    val vip = true
    val admin = false
    val result = vip.and(admin) //与操作
    val result2 = vip.or(admin) //或操作
    //无符号右移
    //0000 1000-> 0000 0010 = 2
    val result3 = 8 ushr (2)
    println()
}