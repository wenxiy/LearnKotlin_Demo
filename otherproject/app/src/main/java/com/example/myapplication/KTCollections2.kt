package com.example.myapplication

/*
        · List： 有序列表 通过索引访问元素、元素可以重复
        · Set： 唯一元素的集合，一组无重复的对象。顺序不重要
        · Map： （字典） 一组键值对。键是唯一的，每一个键映射一个值，值不唯一

     */
fun main() {
    //列表创建方式---可变列表mutableListOf 可以不初始化元素，后续可以加
    val arrayString = mutableListOf<String>()
    arrayString.add("1")
    arrayString.add("2")
    arrayString.add("2")
    arrayString.add(3, "3")

    val arrayString2 = mutableListOf<String>("1", "2", "3", "3")
    arrayString2.add("4")
    //列表创建方式---不可变列表 list 必须在泛型里指定元素类型 必须初始化元素 后续不可加
    val arrayInt = listOf<Int>(1, 2, 3)

    //map字典的创建---可变字典 Map是一组键值对，键(key)是唯一的，每个键刚好映射到一个值，值(value)可以重复
    val arrayMap = mutableMapOf<String, String>()
    arrayMap.put("1", "1")
    arrayMap["2"] = "2" //利用alt+Enter 转化为中括号的方式
    arrayMap["3"] = "2"
    arrayMap["3"] = "4"//此时，会覆盖上面的记录
    //map字典的创建---使用Pair指定集合中初始化的元素
    val arrayMap2 = mutableMapOf<String, String>(Pair("key", "value"))
    //Map字典的创建---不可变字典 不能使用put方法
    val arrayMap3 = mapOf(Pair("key", "value")) //通过Pair指定 可以省略泛型
    val arrayMap4 = mapOf<String, String>() //空字典 不能使用put方法

    //Set集合的创建---可变集合，元素唯一
    val set = mutableSetOf<Int>()
    set.add(1)
    set.add(2)
    set.add(3)
    set.add(3) //添加不进去的
    //遍历set的方式
    for (item in set) {
        println(item)
    }
    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set2.add(1) //添加不进去的
    set2.add(2)//添加不进去的
    set2.forEach { println(it) }

    //Set集合创建---不可变集合，元素唯一
    val set3 = setOf<Int>(1, 2, 3)

    //常见操作 适用于set、map、list
    val arrayExamples = mutableListOf<String>("1", "2", "3", "4", "5", "2")
    println("isEmpty: ${arrayExamples.isEmpty()}")
    println("contains: ${arrayExamples.contains("6")}") //返回布尔类型,是否存在
    println("get: ${arrayExamples.get(0)}") //查找元素，index为0的元素是多少
    println("indexOf:${arrayExamples.indexOf("5")}") //判断元素在集合中的下标位置,如果在返回index，不在返回-1 找到第一个符合条件的元素就返回
    println("lastindexOf: ${arrayExamples.lastIndexOf("2")}") //从后往前找到第一个符合的元素就返回，此时返回6
    //迭代器方法，遍历集合
    val iterator = arrayExamples.iterator()
    iterator.forEach { it ->
        println("it: ${it}")
    }
    arrayExamples.clear()//清除集合中元素，isEmpty = true
    println("length: ${arrayExamples.size}") //为0
//    arrayExamples[0] = "0" //修改对应下标的元素 也可以用set
    arrayExamples.add("7") //不指定位置，则放到集合最后
    arrayExamples.add(0, "7") //指定位置，则放到指定
    arrayExamples.removeAt(0) //移除指定位置的元素
    //集合变换操作
    val numbers = mutableListOf(1,2,3,4)
    numbers.reverse() //集合元素反转4，3，2，1
    numbers.forEach {
        println("reverse: ${it}")
    }
    numbers.shuffle() //随机排列元素
    numbers.sort() //排序，从小到大排序
    numbers.sortDescending() //排序，从大到小排序

}