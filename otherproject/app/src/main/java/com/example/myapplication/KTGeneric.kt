package com.example.myapplication

import org.json.JSONObject

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
    fromJson2<JSONObject>("{}", JSONObject::class.java)
    fromJson3<User>("{}", User::class.java)
    //
}

interface Drink<T> {
    fun drink(t: T)

}

class DrinkApple : Drink<String> {
    override fun drink(t: String) {
        print("drink:$t")
    }

}

class User : JSONObject(), Comparable<User> {
    override fun compareTo(other: User): Int {
        return 0
    }

}

open class Animal

open class DogAnimal : Animal()

class CatAnimal : Animal()

class WhiteDogAnimal : DogAnimal()

fun animalFuns() {
    //泛型类型限定如下所示
    //类型转换错误演示，集合类型强转是不被允许的,加out或者in是允许的
    //  val animalList1 : ArrayList<Animal> = ArrayList<DogAnimal>()
    val animalList2: ArrayList<out Animal> = ArrayList<DogAnimal>()
    //简化写法如下所示
    val animalList3: ArrayList<Animal> = ArrayList<DogAnimal>()
    //使用in关键字声明，约定泛型的下限，允许传入的泛型类型是DogAnimal及其父类Animal
    val animalList: ArrayList<in DogAnimal> = ArrayList<Animal>()
}

//在class里面加入out
class ArrayList<out T> {
}

abstract class Color<T>(val t: T) {
    abstract fun printColor()
}

class BlueColor(val color: String) : Color<String>(color) {
    override fun printColor() {
        println("printColor:${color}")
    }

}

//返回值可能为空，就加一个问号
fun <T> fromJson(json: String, tClass: Class<T>): T? {
    val t: T? = tClass.newInstance()
    return t
}

//泛型类型的限定-1
fun <T : JSONObject> fromJson2(json: String, tClass: Class<T>): T? {
    val t: T? = tClass.newInstance()
    return t
}

//泛型类型的限定-1
//所传递的类型T必须同时满足 where 子句的所有条件，在下面示例中，类型T必须即实现了JSONObject，也实现了Comparable
fun <T> fromJson3(json: String, tClass: Class<T>): T? where T : JSONObject, T : Comparable<T> {
    val instance: T? = tClass.newInstance()
    return instance
}