package com.example.pro01.ex05
//프로퍼티가 포함된 주 생성자

//주 생성자 선언
class Bird7 (var name: String, var wing: Int, var beak: String, var color: String) {
    //프로퍼티 - 위에 var 혹은 val로 선언하므로서 프로퍼티가 이미 포함됨
    
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird7("bird", 11, "long","orange" ) //기본값이 있는 것은 생략하고 없는 것만 전달 가능
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")

}