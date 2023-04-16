package com.example.test.ch
//초깃값 할당

//val data1:Int 오류
val data2 = 10

fun someFun() {
    val data3: Int
    //println("data3:$data3") //오류
    data3 = 10
    println("Data3: $data3")
}

class User {
    //val data4: Int //오류
    val data5: Int = 10
}

//lateinit var data1: Int //오류
//lateinit val data2 : String  //오류
lateinit var data5 : String //var과 String형에서만 lateinit 사용가능

val data4: Int by lazy {
    println("in lazy......")
    10
}

fun main() {
    println("in main......")
    println(data4 + 10)
    println(data4 + 10)
}