package com.example.pro01.ex03

fun main() {
    print("Enter the position: ")
    val position = readLine()!!.toString()
    var score=0

    when(position) {
        "부장" -> score= 600
        "차장" -> score= 500
        "과장" -> score= 400
        "대리" -> score= 300
        "사원" -> score= 200
    }
    println("$score")
}