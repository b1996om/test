package com.example.test
//조건문 when(선택문)
fun main() {
    var data = 10
    when(data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }
}