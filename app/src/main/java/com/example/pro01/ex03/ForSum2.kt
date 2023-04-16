package com.example.pro01.ex03
//홀수의 합계
fun main() {
    var sum: Int = 0
    for(i in 1..10 step 2) { //2씩 증가
        sum += i
        println("$i")  //1 ,3, 5, 7, 9
    }
    println(sum) //25
}