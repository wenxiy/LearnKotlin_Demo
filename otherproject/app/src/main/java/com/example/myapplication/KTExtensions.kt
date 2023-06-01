package com.example.myapplication

//kotlin扩展函数 extensions
fun main() {
    Jump().test()
    val list = mutableListOf<Int>(1, 2, 3, 4)
    list.swap(0, 2)
    for (i in list) {
        println("index:$i")
    }
    val android = "android"
    val lastChar = android.lastChar
    println("lastChar:${lastChar}")
    //apply内置扩展函数
    testApply()
}

//如果引入了一个class包，但是我们无法进去更改这个类包，我们就在外部去扩展函数
class Jump {
    fun test() {}
}

//扩展方法的定义，就是在方法的前面加上类的前缀
fun Jump.doubleJump(): String {
    return "doubleJump"
}

//扩展泛型方法的定义，还要在fun后加上泛型表达
fun <T> MutableList<T>.swap(index: Int, index2: Int) {
    val temp = this[index]
    this[index] = this[index2]
    this[index2] = temp
}

//扩展属性
val String.lastChar: Char get() = this.get(length - 1)


//let扩展函数，类后面加上？代表参数可能为空，使用的时候 注意判空
fun testLet(str: String?) {
    str.let {
        val str2 = "android"
        println(str2 + it)
    }
    //  println(str2) str2访问不到 因为let是限制了作用域
    //判空用法
    str?.let {
        val str2 = "android"
        println(str2 + it)
    }
}

//run拓展函数方法
//run函数接受一个lambda函数作为参数，以闭包的形式返回，返回值最后一行的值或者指定的return的表达式，在run函数中可以直接访问实例的公有属性和方法
fun testRun(jump: Jump): String {
    jump.run {
        test()
        return "222"
    }
}

//apply扩展函数
//调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回对象，与run函数不同是返回传入的对象本身，而run是返回最后一行代码的值
fun testApply() {
    ArrayList<String>().apply {
        add("111")
        add("2222")
    }.run {
        for (s in this) {
            println("apply:$s")

        }
    }
}