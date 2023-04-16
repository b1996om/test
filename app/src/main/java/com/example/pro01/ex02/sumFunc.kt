package com.example.pro01.ex01

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun main() {
    val result1 = sum(3,2) //5 - IntelliJ IDEA에서 매개변수(a: 3, b: 2)를 보여줌
    val result2 = sum(6,7) //13 - IntelliJ IDEA에서 매개변수(a: 6, b: 7)를 보여줌

    println(result1)
    println(result2)
}