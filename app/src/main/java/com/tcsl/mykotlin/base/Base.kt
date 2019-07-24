package com.tcsl.mykotlin.base

import com.tcsl.mykotlin.inter.Clickable

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/24 14: 58
 */

open class Base : Clickable {

    /**
     * 这个函数是final的，不能再子类中重写
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