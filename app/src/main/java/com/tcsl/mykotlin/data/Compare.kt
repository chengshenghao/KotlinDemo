package com.tcsl.mykotlin.data

import java.io.File

/**
 * 描述:
 * <p/>作者：csh
 * <br/>创建时间：2019/7/26 16: 57
 */

object Compare : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}