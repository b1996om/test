package com.example.pro01.ex12

data class Point2(val x: Int, val y: Int)

operator fun Point2.unaryMinus() = Point2(-x, -y)

fun main() {
    val point1 = Point2(10,20)
    val point2 = Point2(-10, -20)
    println(point1) //Point2(x=10, y=20)
    println(point2) //Point2(x=-10, y=-20)
    println(-point1) //Point2(x=-10, y=-20)
    println(-point2) //Point2(x=10, y=20)
}