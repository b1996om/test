package com.example.pro01.ex05

open class Bird10(var name: String,var wing: Int, var beak: String, var color: String) {
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

//주 생성자를 사용하는 상속
class Lark(name:String, wing:Int, beak:String, color:String) : Bird10(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!") //새로 추가된 메서드
}

//부 생성자를 사용하는 상속
class Parrot : Bird10 {
    val lang: String

    constructor(name: String, wing: Int, beak: String, color: String,
                lang: String) : super(name, wing, beak,color) {
        this.lang = lang //새로 추가된 프로퍼티
    }
    fun speak() = println("Speak! $lang")
}

fun main() {
    val coco = Bird10("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}")
}