package com.example.test.exam01

fun main() {
    val a: Int  = 128
    val b = a

    println(a === b) //true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) //값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) //값의 내용은 같지만 참조를 비교해 다른 객체(주소다름)이므로false
    println(c === e) //값의 내용도 같고 참조된 객체도 동일(주소동일)하므로true

}