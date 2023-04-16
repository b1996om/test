package com.example.pro01.ex04
//람다식에서 라벨과 함께 return 사용하기
//암묵적 라벨
fun main() {
    retFunc3()
}

//inline 제거됨
fun inlineLambda3(a:Int, b:Int, out:(Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc3() {
    println("start of retFunc3")
    inlineLambda3(13, 3) {a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda3
        println("result: $result")
    }
    println("end of retFunc3")
}