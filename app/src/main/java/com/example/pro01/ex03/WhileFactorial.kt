package com.example.pro01.ex03
//while문으로 활용한 팩토리얼 계산하기
fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number >0) {
        factorial *= number
        --number
    }
    println("Factorial: $factorial")
}