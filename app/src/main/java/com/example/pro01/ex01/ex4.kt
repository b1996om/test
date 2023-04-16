package com.example.test.exam01
//세이프 콜과 엘비스 연산자를 활용해  null 허용
//삼항연산
fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1:$str1 length:${str1?.length ?: -1}")
    
    //str1?.length ?: -1  삼항연산의 간략화
    //->  str1이 참이면 str1.length를 거짓이면 -1
}