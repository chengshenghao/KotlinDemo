package com.tcsl.mykotlin

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/6/27 13: 13
 */

class MyClass {
    //伴生类
    companion object {

    }

}

/**
 * 伴生类的扩展
 */
fun MyClass.Companion.foo() {
    println("伴生对象的扩展函数")
}

/**
 * 扩展函数
 */
fun MyClass.fooo() {
    println("扩展函数")
}