package com.tcsl.mykotlin.base

import com.tcsl.mykotlin.inter.Clickable

/**
 * 描述:类中访问修饰符的意义
 * final：不可以被重写，类中成员默认使用
 * open：可以被重写，需要明确声明
 * abstract：必须被重写，只能在抽象类中使用，抽象成员不能有实现
 * override：重写父类或接口中的成员，如果没有被final表明，重写的成员默认是open的
 * <p/>作者：ss
 * <br/>创建时间：2019/7/24 14: 58
 */

open class Base : Clickable {

    /**
     * 这个函数是final的，不能再子类中重写
     * 所有的声明是默认final、public的
     */
    fun disable() {}

    /**
     * 这个函数是open的，可以在子类中重写
     */
    open fun animate() {}

    /**
     * 这个函数重写一个open函数，并且他本身也是open的
     * 禁止重写必须加final
     */
    override fun onclick() {
    }


}