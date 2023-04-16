package com.example.pro01.ex11
//코틀린 중첩 클래스에서 바깥 클래스 접근하기
//Outer클래스가 컴패니언 객체를 가지로 있을 때 접근 가능
class Outer2 {
    class Nested2 { //static(정적)멤버
        fun accessOuter() {  //컴패니언 객체는 접근할 수 있다.
            println(country)
            getSomething()
        }
    }

    companion object { //컴패니언 객체는 static처럼 접근 가능
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}
fun main() {
    Outer2.Nested2().accessOuter()
}