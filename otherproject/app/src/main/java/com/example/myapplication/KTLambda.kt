package com.example.myapplication

//kotlin Lambda
fun main() {
    //普通成员方法声明与调用
    //需要先构建出实例对象，才能访问成员王法
    //实例对象的构建只需要在类名后面加上()
    //Person() = java中new关键字
    Person().test()
    Person.text2()

    //静态类里面的方法，都是静态方法
    //不需要构建实例对象，可以通过类名，直接访问静态方法
    val result = NumUtil.double(1)
    println("result: $result") //字符串表达式可以去除花括号

    //方法中的参数
    //默认参数:提前给read函数中offset参数赋值，减少重载量
    read(1, 2)

    //具名参数 (指定参数的名称)
    //如果想要使用默认值，只传入没有默认值的参数，只能通过具名参数调用该方法
    read(start = 1)

    read2(1, 2, action = {
        val result = 1 * 2
        //方法体里面的最后一行，就是该方法的返回值
        "括号内使用具名参数，传递action参数"
    })

    read2(start = 1) {
        "括号外传递action参数"
    }

    val append = append('1', '2', '3', '4', start = 1)
    println("append： $append")

    val world = charArrayOf('w', 'o', 'r', 'l', 'd')
    val append2 = append('h', 'e', 'l', 'l', 'o', ' ', *world, start = 1)
    println("append2： $append2")
    //调用具有方法类型参数的方法
    val numbers = arrayOf(1, 2, 3, 4)
    //具名参数的调用，即用参数名action= 来赋值
    transform(numbers, action = { index, element ->
        index * element //闭包中最后一行表达式，计算后的结果，就是action函数的返回值
    })//也可以省略方法，因为action是他最后一个参数
    for (numbers in numbers) {
        println("transform: $numbers")
    }
    //lambda隐形参数it
    numbers.forEach {
        println(it)
    }

    val list = arrayListOf<Int>(1, 2, 3, 4, 5, 6)
    list.forEachIndexed(action = { index: Int, element: Int ->
        println("forEachindexed: $index->$element")
    })
    list.forEachIndexed { index: Int, element: Int ->
        println("forEachindexed2:$index->$element")
    }

}

//不定长参数传输
//一个方法中只能有一个vararg参数（不定参数）
//如果vararg参数不是最后一个参数，必须要用具名参数语法，给后面的参数传递值
fun append(vararg str: Char, start: Int): String {
    val result = StringBuffer()
    for (char in str) {
        result.append(char)
    }
    return result.toString()
}

fun read(offset: Int = 0, start: Int) {
    println("read: ${offset},${start}")
}

//offset:int 他有一个默认值0
//start:int 他没有默认值
//第三个参数是一个方法，参数名叫做，action:(). 如果参数的类型是(),说明该参数是一个方法
//方法参数的返回值使用 -> String
fun read2(offset: Int = 0, start: Int, action: () -> String) {
    val ret = action()
    println("read2:$ret")
}

// lambda表达式作为方法中的参数的时候/定义transform方法，可以对数组中的元素进行变换
// array:要求传入一个数组，元素类型为Int整型类型
// action:要求传入的是一个方法，接受两个参数下标index，元素element
// 要求返回变换后的元素，会替换老的元素
fun transform(array: Array<Int>, action: (index: Int, element: Int) -> Int) {
    for (index in array.indices) {//indices是通过索引的方式遍历数组
        val newValue = action(index, array[index])
        array[index] = newValue
    }
}

//普通类方法
class Person {
    fun test() {
        println("成员方法")
    }

    //当我们想在一个普通类，也就是class声明的类里面。想要定义一个静态方法的话
    //不需要构建实例对象，可以直接通过类名，直接访问静态方法
    //伴生类
    companion object {
        fun text2() {
            println("成员方法text2")
        }
    }
}

//静态类的方法
//如果我们想实现一个工具util的话，可以借助关键字object来创建一个静态类
object NumUtil {
    fun double(num: Int): Int {
        return num * 2
    }
}