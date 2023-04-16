package com.example.pro01.ex09
import java.util.*
//게터를 통한 구현1
/*
  인터페이스에서는 프로퍼티에 값을 저장할 수 없지만
  val로 선언된 프로퍼티는 게터를 통해 필요한 내용을 구현할 수 있다.
 */
interface Pet1 {
    var category: String
    val msgTags: String  //val선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"

    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Cat1(override var category: String) : Pet1 {

    override  fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat1("small")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding() //구현된 메서드
    obj.patting() //기본 메서드
}