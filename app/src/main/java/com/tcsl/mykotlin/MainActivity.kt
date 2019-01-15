package com.tcsl.mykotlin

//包的声明应处于源文件顶部

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    /*
     * 定义变量
     * 成员变量:有默认值。也可以直接赋值，但不可以定义再赋值（声明变量,再给变量赋值）
     * 局部变量:没有默认值。可以先定义再赋值。 使用之前必须赋值，否则报错）
     */
    val TAG = "csh"
    val a: Int = 1//立即赋值
    val b = 2//自动推断出为int类型


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "" + sum(1, 2))
        Log.i(TAG, "" + sum2(1, 2))
        printSum(2, 3)
        printSum2(2, 3)
        //局部变量
        val c: Int// 如果没有初始值类型不能省略
        c = 3 // 明确赋值

        //可重新赋值的变量使用 var 关键字：
        var x = 5 // 自动推断出 `Int` 类型
        x += 1

        stringModel()
    }

    // 定义函数
    /**
     * 带有两个Int参数，返回Int函数
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     *  将表达式作为函数体、返回值类型自动推断的函数
     */
    fun sum2(a: Int, b: Int) = a + b;

    /**
     * 函数返回无意义的值
     */
    fun printSum(a: Int, b: Int): Unit {
        Log.i(TAG, (a + b).toString());
    }

    /**
     * Unit可以省略
     */
    fun printSum2(a: Int, b: Int) {
        Log.i(TAG, (a + b).toString())
    }

    /**
     * 顶层变量
     */
    val PI = 3.14
    var x = 0
    fun incrementX() {
        x += 1
    }

    /**
     * 字符串模板(字符串可以包含模板表达式 ，即一些小段代码，会求值并把结果合并到字符串中。
     * 模板表达式以美元符（$）开头，由一个简单的名字构成:)
     */
    fun stringModel(){
        val i = 2;
        Log.i("csh","i=$i");
    }

}
