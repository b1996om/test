package com.example.pro01.ex04
//continue문
fun main() {
    for(i in 1..5) {
        if(i==3) continue
        println(i) //1,2,3,4,5
    }
    println()
    println("outside") //outside
}
