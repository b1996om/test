package com.example.pro01.ex11
//중첩 클래스(Nested class) : 코틀린에서 중첩 클래스는 기본적으로 정적(static) 클래스처럼 다뤄진다.
class Outer { //0x40
    val ov = 5 //인스턴스 멤버
    class Nested { //static(정적)멤버
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" //외부의 ov에는 접근 불가!
    }
    fun outside() { //인스턴스 멤버
        val msg = Nested().greeting() //Outer객체 생성 없이 중첩 클래스 의 메서드 접근 가능
        println("[Outer]: $msg, ${Nested().nv}") //중첩 클래스의 프로퍼티 접근 가능

    }
}

fun main() {
    //static처럼 Outer의 객체 생성 없이 Nested객체를 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    //Outer.outside() //에러! Outer 객체 생성 필요
    val outer = Outer() //0x40
    outer.outside()
}