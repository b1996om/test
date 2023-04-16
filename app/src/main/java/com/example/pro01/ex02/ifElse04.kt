package com.example.pro01.ex02
//코틀린에서 if~else는 표현식으로도 사용할수 있다.
//표현식이란 결과값을 반환하는 계산식을 말함
fun main() {
    var data = 10
    val result = if(data>0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)

}