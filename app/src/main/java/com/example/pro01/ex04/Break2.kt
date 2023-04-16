package com.example.pro01.ex04
//라벨과 함께 사용한 break문
fun main() {
    labelBreak2()
}

fun labelBreak2() {
    println("labelBreak2")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if(j == 3) break@first
            println("i: $i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}