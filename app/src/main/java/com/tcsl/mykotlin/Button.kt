package com.tcsl.mykotlin

import com.tcsl.mykotlin.inter.Clickable

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/24 14: 25
 */

class Button : Clickable {
    override fun onclick() {
        println("我被点击了")

    }


}