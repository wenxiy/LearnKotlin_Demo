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
    //map list 数组都可以使用
    items.forEachIndexed { index, item ->
        println("forEachIndexed: ${index},${item}")
    }
    //while循环
    var index = 0
    while (index < items.size) {
        println("The $index element is ${items[index++]}") //普通while循环
    }
    index = 0
    //do while先执行一次循环体，再看循环条件while里面是否满足-若满足继续执行循环体，不满足则推出
    do {
        println("The $index element is ${items[index++]}") //do while循环 以上两种方式都是一样的输出结果
    } while (index < items.size)

    //迭代器区间表达式循环控制
    //for in ..
    //in 包含左边右边最后一个，左闭右闭的区间
    //输出结果为：1 2 3 4 5 6 7 8 9 10
    for (it in 1..10) {
        print("it is $it")
    }
    //for in-until
    //untile 不包含右边最后一个，左闭右开的区间
    //输出结果为：1 2 3 4 5 6 7 8 9
    for (i in 1 until 10){
        println("i is $i")
    }
    //for in downto step
    //downto是指倒叙遍历 10到1
    //step是指步长，例如会打印10 8 6 4 2 是指下标相差两个
    for (i in 10 downTo 1 step 2) {
        println("$i")
    }
    //break与continue 与Java是类似的，break退出所有循环，continue是跳出本次循环，下一层的循环跳不出去


}