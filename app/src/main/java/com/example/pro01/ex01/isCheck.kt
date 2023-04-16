package com.example.test.exam01

fun main() {
    val num=256

    if(num is Int) {  //num이 Int형일 때
        print(num)
    } else if(num !is Int) { //num이 Int형이 아닐때, !(num is Int)와 동일
        println("Not a Int")
    }
}