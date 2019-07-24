package com.tcsl.mykotlin.base

/**
 * 描述:抽象类，无法创建实例
 * <p/>作者：ss
 * <br/>创建时间：2019/7/24 15: 23
 */

abstract class Animated {
    /**
     * 函数是抽象的，他没有实现，子类必须重写
     */
    abstract fun absAnimatic()

    //可以被重写
    open fun openAnimatic() {}

    //不能被重写
    fun animatic() {}
}