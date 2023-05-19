package com.example.myapplication

//kotlin泛型：类型参数化，引入给强类型编程语言加入更强的灵活性
//泛型可以用于架构开发、开发框架、增加健壮性ClassCastException、理解与研究框架、可以造轮子
fun main() {
    //1.泛型接口
    val drinkApple = DrinkApple()
    drinkApple.drink("drink")
    //2.泛型类
    val blueColor = BlueColor("blue")
    //3.泛型方法：做Json序列化时，返回值时不确定的，是调用的时候传递的泛型确定的
    //类型参数要放在方法名前面   String::class.java代表传递class类型参数
    fromJson<String>("{}", String::class.java)
}

interface Drink<T> {
    fun drink(t: T)

}

class DrinkApple : Drink<String> {
    override fun drink(t: String) {
        print("drink:$t")
    }

}

abstract class Color<T>(val t: T){
    abstract fun printColor()
}

class BlueColor(val color: String) :Color<String>(color) {
    override fun printColor() {
        println("printColor:${color}")
    }

}
//返回值可能为空，就加一个问号
fun <T> fromJson(json: String, tClass: Class<T>) :T? {
    val t: T? = tClass.newInstance()
    return t
}