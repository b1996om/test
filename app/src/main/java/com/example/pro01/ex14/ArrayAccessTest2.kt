package com.example.pro01.ex14

import java.util.*

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5, 8)
    println("arr: ${Arrays.toString(arr)}")
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    arr.set(1, 5)
    arr[0] = 3
    println("size: ${arr.size}, arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    for(i in 0..arr.size-1) {
        println("arr[$i] = ${arr[i]}")
    }
}