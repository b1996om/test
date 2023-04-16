package com.example.pro01.ex05
//여러 개의 부 생성자 지정의 예
class Bird4 {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing =  wing
        this.beak = beak
        this.color = color
    }

    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val bird1 = Bird4("mybird", 2, "short", "blue")
    val bird2 = Bird4("mybird2","long")
    println("bird1.color: ${bird1.color}")
    println("bird2.color: ${bird2.color}")
    bird1.fly()
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)
}