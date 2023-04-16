package com.example.pro01.ex03

fun main() {
    var data = 10
    val result = when {
        data <= 0 -> "data is <= 0"
        data > 100 -> "data is >100"
        else -> "data is valid"
    }
    println(result) //실행결과 : data is valid
}