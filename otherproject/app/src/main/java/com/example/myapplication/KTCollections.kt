package com.example.myapplication

import org.json.JSONObject

//kotlin容器
fun main() {
    //kotlin数组
    //1.使用arrayOf创造数组，必须指定数组的元素，可以是任意类型
    val arrayNumber = arrayOf(1, 2, 3, 4) //动态推断数组类型
    val array1: Array<Int> = arrayOf(1, 2, 3)
    //kotlin中的any就是java中的objects 对象的意思
    val arrayObjects = arrayOf(1, true, "2")
    //2.使用arrayOfNulls创建空数组
    //创建一个指定大小的、所有元素为空的数组，必须指定类型
    val arrayOfNulls: Array<String?> = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "element1"
    arrayOfNulls[1] = "element2"
    arrayOfNulls[4] = null
    //？类型代表数组里面可以为空
    //3.利用array的构造函数，动态创建数组
    // i = 0,1,2,3,4
    // i * i = "0","1","4","9","16"
    //数组创建的时候，会循环5此，i就是数组下标
    // -> 右边的表达式的结果，就是数组中当前下标的元素
    val asc: Array<String> = Array(5) { i -> (i * i).toString() }
    //字节数组
    val bytes = ByteArray(5)
    bytes[0] = 0
    //5.使用IntArray创建整型
    //1.创建一个长度为5的空的IntArray
    val intArray2 = IntArray(5)
    intArray2[0] = 1
    //2.创建一个长度为5的值全为100的IntArray
    val intArr2 = IntArray(5) { 100 }
    // 4.创建一个长度为5的IntArray[0,2,4,6,8]
    val intArr3 = IntArray(5) { it * 2 } //it,lambda表达式专有变量，这里指的是数组下标
    // 数组如何进行for循环遍历
    // 依次取出数组中元素--for-in的形式
    for (item in intArr3) {
        //   println(item)
    }
    //下标遍历,根据下标再取出对应位置元素
    //for-in
    for (i in intArr3.indices) {
        //   println(i.toString() + "->" + intArr3[i])
    }
    //for循环--同时遍历下标和元素
    for ((index, item) in intArr3.withIndex()) {
        println("$index->$item")
    }
    //forEach会依次回调给我们数组中的元素
    intArr3.forEach {
        println("forEach: $it") //这里的it代表的是数组元素
    }
    //forEach增强版 会依次回调给我们数组中的下标和元素
    intArr3.forEachIndexed{ index , item ->
        println("$index: $item")
    }
    //集合：集合的大小可以动态的改变，而数组不同
    /*
        · List： 有序列表 通过索引访问元素、元素可以重复
        · Set： 唯一元素的集合，一组无重复的对象。顺序不重要
        · Map： （字典） 一组键值对。键是唯一的，每一个键映射一个值，值不唯一

     */

}