package com.example.pro01.ex13
//제네릭형 - 객체 생성 시에 자료형을 확정한다.
class Box<T>(t: T) {
    var name = t
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")

    println(box1.name)
    println(box2.name)
}