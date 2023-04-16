package com.example.pro01.ex04
//예외처리(exception)
//0으로 나누었을 때 예외 처리하기
fun main() {
    val a = 6
    val b = 0
    val c: Int
    
    try {
        c = a/b
    } catch (e: Exception) {
        println("Exception is handled.")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}