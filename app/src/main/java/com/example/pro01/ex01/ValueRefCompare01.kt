package com.example.test.exam01
//이중등호(==)와 삼중등호(===)
fun main() {
    val a: Int = 128
    val b: Int = 128
    println(a==b) //true
    println(a===b) //true

    //참조주소가 달라지는 경우
    val c: Int = 128
    val d: Int? = 128
    println(c==d) //true
    println(c===d) //false가 맞음
}