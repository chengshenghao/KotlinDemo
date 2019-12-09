package com.tcsl.mykotlin;

import com.tcsl.mykotlin.inter.Clickbles;

import java.util.ArrayList;
import java.util.List;

import static com.tcsl.mykotlin.StringFunctions.joinToString;


/**
 * 描述:
 * <p/>作者：csh
 * <br/>创建时间：2019/12/9 10: 12
 */

public class Buttons implements Clickbles {
    @Override
    public void clike() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("java使用顶层函数" + joinToString(list));
    }

}
