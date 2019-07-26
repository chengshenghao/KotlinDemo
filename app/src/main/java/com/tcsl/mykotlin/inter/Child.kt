package com.tcsl.mykotlin.inter

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/6/24 13: 18
 */

class Child : MyInterfaceTwo, MyInterface {
    override fun zoo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun foo() {
        super<MyInterface>.foo()
        super<MyInterfaceTwo>.foo()
    }


    override val prop: Int = 29

    override fun bar() {
        println("我是实现类")
    }


}