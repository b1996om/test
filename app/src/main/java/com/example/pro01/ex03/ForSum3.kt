package com.example.pro01.ex03
//짝수의 합계
fun main() {
    var sum: Int = 0
    for(i in 2..10 step 2) { //2씩 증가
        sum += i
        println("$i")  //2, 4, 6, 8, 10
    }
    println(sum) //30
}




