package com.example.pro01.ex10
//copy() 사용해서 일부 데이터 변경하기
data class Customer1(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job:String): this(name, email) {
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Customer1("Sean", "sean@mail.com")
    val cus3 = cus1.copy(name = "Alice") //name만 변경하고자 할때

    println(cus1.toString())
    println(cus3.toString())
}
/*
실행결과:
Customer1(name=Sean, email=sean@mail.com)
Customer1(name=Alice, email=sean@mail.com)
 */