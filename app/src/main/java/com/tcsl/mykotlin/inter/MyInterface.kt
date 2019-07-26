package com.tcsl.mykotlin.inter

/**
 * 描述:Kotlin中接口和Java中的相似，但可以包含默认实现和属性
 * <p/>作者：csh
 * <br/>创建时间：2019/6/24 13: 16
 */

interface MyInterface {
    val prop: Int // 抽象的
    fun bar()
    fun foo() {
        //可选的方法体
    }
}