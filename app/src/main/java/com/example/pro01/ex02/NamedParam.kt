package com.example.pro01.ex02

fun main(args: Array<String>) {
    namedParam(x=100, z=100)
    namedParam(z=150)
}

fun namedParam(x:Int=100, y:Int=200, z: Int) {
    println(x+y+z)
}