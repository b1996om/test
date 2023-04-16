package com.example.pro01.ex04
//라벨과 함께 사용한 continue문
fun main() {
    labelContinue2()
}

fun labelContinue2() {
    println("labelContinue2")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if(j == 3) continue@first
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}
