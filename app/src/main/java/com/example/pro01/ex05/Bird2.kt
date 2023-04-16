package com.example.pro01.ex05
//this키워드 생략하고 이름다르게 설정(그냥 this쓰고 이름통일하는 방법을 추천)
class Bird3 {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name=_name
        wing=_wing
        beak=_beak
        color=_color
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird3("mybird",2,"short", "blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}