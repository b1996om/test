package com.example.pro01.ex04
//라벨없는 continue문
fun main() {
    labelContinue1()
}
fun labelContinue1() {
    println("labelContinue1")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if(j == 3) continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}
