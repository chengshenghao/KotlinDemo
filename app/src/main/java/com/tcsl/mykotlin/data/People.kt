package com.tcsl.mykotlin.data

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/26 10: 20
 */

class People(val age: Int, name: String = "lilei") { //val代表相应的属性会用构造方法的参数来初始化

    //带两个参数的主构造方法
    val name: String

    //初始化语句块
    init {
        this.name = name
    }
}