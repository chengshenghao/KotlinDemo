package com.tcsl.mykotlin.data

/**
 * 描述:将声明一个类和创建一个类结合起来
 * <p/>作者：csh
 * <br/>创建时间：2019/7/26 16: 17
 */

object PayRoll {
    val allEmployees = arrayListOf<People>();
    fun allPeople() {
        for (people in allEmployees) {
            println(people.toString())
        }
    }
}