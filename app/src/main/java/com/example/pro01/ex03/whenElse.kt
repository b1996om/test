package com.example.pro01.ex03

fun main() {
    var data = "hello" //data는 String형
    when(data) {
        "hello" -> println("data is hello")
        "world" -> println("data is world")
        else -> {
            println("data is not valid data")
        }
    }
} //실행결과 : data is hello