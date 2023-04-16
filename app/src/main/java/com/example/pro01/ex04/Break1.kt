package com.example.pro01.ex04
//라벨없는 break문
fun main() {
    labelBreak1()
}
fun labelBreak1() {
    println("labelBreak1")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if(j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}