package com.example.pro01.ex08
//object표현식 :
//object 표현식이 사용될 때마다 새로운 인스턴스가 생성된다.
//이름이 없는 익명 내부 클래스로 불리는 형태를 object표현식으로 만들수 있다.
open class Superman() {
    fun work() = println("Taking photos.")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}
//하위 클래스를 만들지 않고도 새로운 구현인 fly()를 포함할 수 있다.

fun main() {
    val pretendenMan = object : Superman() {  //object 표현식으로 fly()구현의 재정의!
        override fun fly() = println("I'm not a realman. I can't fly!")
    }
    pretendenMan.work()
    pretendenMan.talk()
    pretendenMan.fly()
}
