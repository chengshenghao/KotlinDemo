package com.tcsl.mykotlin.inter

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/6/24 13: 18
 */

class Child : MyInterfaceChild {
    override val prop: Int = 29

    override fun bar() {
        println("我是实现类")
    }

    override fun child() {
        TODO("MyInterfaceChild独有方法") //To change body of created functions use File | Settings | File Templates.
    }

}