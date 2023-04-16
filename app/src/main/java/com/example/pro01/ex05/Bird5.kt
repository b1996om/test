package com.example.pro01.ex05
//클래스명과 함께 생성자 정의

//주 생성자 선언
class Bird5 constructor(_name: String, _wing: Int, _beak: String, _color: String) {
    
    //프로퍼티
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color
    
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird5("mybird",2,"short", "blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}