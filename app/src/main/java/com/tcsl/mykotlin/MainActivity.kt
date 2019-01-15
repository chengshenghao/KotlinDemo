package com.tcsl.mykotlin

//包的声明应处于源文件顶部

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "csh"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "" + sum(1, 2));
        Log.i(TAG, "" + sum2(1, 2));
        printSum(2, 3);
        printSum2(2, 3);
    }

    // 定义函数
    /**
     * 带有两个Int参数，返回Int函数
     */
    fun sum(a: Int, b: Int): Int {
        return a + b;
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
    fun printSum2(a:Int ,b:Int){
        Log.i(TAG,(a+b).toString())
    }

}
