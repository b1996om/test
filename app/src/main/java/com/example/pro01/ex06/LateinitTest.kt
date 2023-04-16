package com.example.pro01.ex06

class Person() {
    lateinit var name: String
    fun test() {
        if(!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kingdong"
    kildong.test()
    println("name = ${kildong.name}")
}