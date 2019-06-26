package com.tcsl.mykotlin

//包的声明应处于源文件顶部

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tcsl.mykotlin.inter.Child

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
        var person = Person("xiaoming");
        var cs = Constructors(1)
        var child = Child();
        child.bar()
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
    fun printSum(a: Int, b: Int): Unit {
        println("sum a and b is ${a + b}")
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
        for (index in items.indices) {
            Log.d("for循环", items[index])
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

    val fruits = listOf("banana", "avocado", "apple")
    /**
     * 集合的使用
     */
    fun getfruit() {
        for (fruit in fruits) {
            Log.d(TAG, fruit)
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

    /**
     * 使用类
     * 如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
     */
    class Person constructor(firstname: String) {
        //主构造的参数可以在初始化块中使用。它们也可以在类体内声明的属性初始化器中使用
        var firstProperty = firstname.toUpperCase();

        //主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块（initializer blocks）中。
        init {
            println(firstname)
            println(firstProperty)
        }
    }

    /**
     * 次构造函数
     * 初始化块中的代码实际上会成为主构造函数的一部分。委托给主构造函数会作为次构造函数的第一条语句，
     * 因此所有初始化块中的代码都会在次构造函数体之前执行。即使该类没有主构造函数，这种委托仍会隐式发生，并且仍会执行初始化块
     */
    class Constructors {
        constructor(i: Int) {
            println("Constructor")
        }

        init {
            println("Init block")
        }
    }

    /**
     * 继承
     */
    open class Base(p: Int)

    //要声明一个显式的超类型，我们把类型放到类头的冒号之后：
    class Dervice(p: Int) : Base(p)

    /**
     * 覆盖方法
     * 与 Java 不同，Kotlin 对于可覆盖的成员（我们称之为开放）以及覆盖后的成员需要显式修饰符：
     */
    open class MyBase() {
        open fun getDervice() {}
    }

    class MyDervice(p: Int) : MyBase() {
        override fun getDervice() {}
    }

    /**
     * 覆盖属性
     * 你也可以用一个 var 属性覆盖一个 val 属性，但反之则不行
     */
    open class Foo {
        open val x: Int
            get() {
                return 2
            }
    }

    class Bar1 : Foo() {
        override val x: Int = 1
    }
    /**
     * 抽象类
     */
    open class Base1 {
        open fun f() {}
    }

    abstract class Derived : Base1() {
        override abstract fun f()
    }

}
