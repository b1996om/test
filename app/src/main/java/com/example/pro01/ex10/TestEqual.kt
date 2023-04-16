package com.example.pro01.ex10
//equals()와 hashCode() 사용하기
data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    println(cus1 == cus2) //true
    println(cus1.equals(cus2)) //true
    println("${cus1.hashCode()}, ${cus2.hashCode()}")
}
/*
실행결과 :
true
true
-1521025108, -1521025108
 */