package com.tcsl.mykotlin.inter

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/7/11 13: 25
 */

interface MyInterfaceTwo {
    fun zoo()
    //MyInterface也存在这个方法，同时实现MyInterface和MyInterfaceTwo时，子类会提示让提供自己的实现
    fun foo(){

    }
}