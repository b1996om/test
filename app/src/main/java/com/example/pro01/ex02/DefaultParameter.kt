package com.example.pro01.ex01
//매개변수의 기본값처리
fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name) //홍길동님의 이메일은 default입니다.
    add(name, email)  //홍길동님의 이메일은 hong@example.kr입니다.
    add("둘리", "dooly@example.kr") //둘리님의 이메일은 dooly@example.kr입니다.

    defaultArgs()  //100+200 = 300
    defaultArgs(200)  //200+200 = 400
}

fun add(name:String, email:String="default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x:Int=100, y:Int=200) {
    println(x+y)
}