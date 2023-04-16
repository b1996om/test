package com.example.pro01.ex06

import com.example.pro01.ex07.Customer

//코틀린에서 자바의 static멤버 사용(1-1)

//코틀린에서 자바의 static 접근
fun main() {
    println(Customer.LEVEL)
    Customer.login()
}