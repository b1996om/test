package com.example.pro01.ex03

fun main() {
    var data: Any = 10 //data는 Int형
    when(data) {
        is String -> println("data is String")
        20, 30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10")
        else -> println("data is not valid")
    }
}  //실행결과 : data is 1..10