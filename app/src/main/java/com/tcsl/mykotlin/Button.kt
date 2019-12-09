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

    /**
     * 当你从java中调用kotlin函数的时候，必须显示的制定所有参数值，
     * 如果需要从java代码中频繁的调用，而且希望他能对java的调用者更加便捷，
     * 可以使用@JvmOverloads注解，这个指示编译器生成重载函数
     */
    @JvmOverloads
    fun <T> joinToString(collection: Collection<T>,
                         speartor: String = ",",
                         prefix: String = "",
                         postfix: String = ""): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(speartor)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()

    }
}