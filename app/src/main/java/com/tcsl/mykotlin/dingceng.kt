@file:JvmName("StringFunctions")

package com.tcsl.mykotlin

/**
 * 描述:  顶层函数使用
 * <p/>作者：csh
 * <br/>创建时间：2019/12/9 13: 06
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