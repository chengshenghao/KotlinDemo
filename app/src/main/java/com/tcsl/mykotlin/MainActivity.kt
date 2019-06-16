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

        Log.i(TAG, "" + maxOf(a, b))

        printProduct("" + 1, "3");

        Log.i(TAG, "" + getStringLength("我是字符串"));

        forsss();

        inUse();
        getfruit()
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
    fun sum2(a: Int, b: Int) = a + b

    /**
     * 函数返回无意义的值
     */
    fun printSum(a: Int,b: Int):Unit{
        println("sum a and b is ${a+b}")
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
    fun stringModel() {
        val i = 2;
        Log.i("csh", "i=$i");
    }

    /**
     * 使用条件表达式
     * 求a、b最大值
     */
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * 用if作为表达式
     */
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b;

    /**
     * 使用可空值及null检测
     */
    fun parseInt(str: String): Int? {
        return Integer.parseInt(str);
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // 直接使用 `x * y` 会导致编译错误，因为他们可能为 null
        if (x != null && y != null) {
            // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
            Log.i(TAG, "" + x * y)
        } else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    /**
     * 使用类型检测及自动类型转换
     * is 运算符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经判断出为某类型，
     * 那么检测后的分支中可以直接当作该类型使用，无需显式转换：
     */
    fun getStringLength(obj: Any): Int? {
        if (obj !is String) return null
        // `obj` 在这一分支自动转换为 `String`
        return obj.length
    }


    val items = listOf("apple", "banana", "kiwifruit")
    /**
     * 使用for循环
     */
    fun forsss() {
//        for (item in items){
//            Log.d("for循环",item)
//        }
        for (index in items.indices){
            Log.d("for循环",items[index])
        }

    }

    val m = 10
    val n = 8
    /**
     * 使用 in 运算符来检测某个数字是否在指定区间内
     */
    fun inUse() {
        if (m in 1..n + 2) {
            Log.i(TAG, "fits in range")
        }
    }

    /**
     * 集合的使用
     */
    val fruits = listOf("banana", "avocado", "apple")
    fun getfruit(){
        for (fruit in fruits){
            Log.d(TAG,fruit)
        }

        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
        //使用 lambda 表达式来过滤（filter）与映射（map）集合
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }


}
