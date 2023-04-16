package com.example.pro01.ex04
//람다식에서 라벨과 함께 return 사용하기

fun main() {
    retFunc1()
}

//inline
inline fun inlineLambda1(a:Int, b:Int, out:(Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc1() {
    println("start of retFunc1")
    inlineLambda1(13, 3) {a, b->
        val result = a + b
        if(result > 10) return
        println("result: $result")
    }
    println("end of retFunc1")
}
