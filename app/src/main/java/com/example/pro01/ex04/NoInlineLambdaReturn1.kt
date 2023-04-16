package com.example.pro01.ex04
//람다식에서 라벨사용
fun main() {
    retFunc2()
}

//inline제거
fun inlineLambda2(a:Int, b:Int, out:(Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc2() {
    println("start of retFunc2")
    inlineLambda2(6, 3) lit@{a, b ->
        val result = a+ b
        if(result > 10) return@lit
        println("result: $result")
    }
    println("end of retFunc2")
}