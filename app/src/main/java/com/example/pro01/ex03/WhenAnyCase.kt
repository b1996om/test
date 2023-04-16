package com.example.pro01.ex03
//다양한 자료형의 인자받기

class MyClass

fun main() {
    cases("Hello") //String
    cases(1) //Int
    cases(System.currentTimeMillis()) //Long
    cases(MyClass()) //객체
}

fun cases(obj: Any) {
    when(obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is Long -> println("Not a String")
        else -> println("Unknown")
    }
}
/*
실행결과 :
String: Hello
Int: 1
Long: 1676424809529
Not a String
 */
