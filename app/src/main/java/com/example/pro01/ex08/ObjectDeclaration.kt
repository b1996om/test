package com.example.pro01.ex07
//Object 키워드를 사용한 방식
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

class Hobby(val name: String)
fun main() {
    OCustomer.greeting() //객체 생성 시점(멤버 호출시!)
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}