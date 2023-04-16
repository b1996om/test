package com.example.test.exam01
//스마트 캐스트 : 값에 따라 자료형을 결정
//Number형은 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스트됨
fun main() {
    var test: Number = 12.2
    println("$test") //12.2 (Double형으로 스마트 캐스트)

    test=12
    println("$test") //12 (Int형)

    test=120L
    println("$test") //120 (Long형)

    test+=12.0f
    println("$test") //132.0 (Float형)
}