package com.example.pro01.ex09

interface Pet3 {
    var category: String
    val msgTags: String  //val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting")
    }
}
open class Animal1(val name: String)

//feeding의 구현을 위해 인터페이스 Pet 지정
class Dog1(name: String, override var category: String) : Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Cat8(name: String, override var category: String) : Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master1 {
    fun playWithPet(dog: Dog1) {
        println("Enjoy with my ${dog.name}.")
    }
    fun playWithPet(cat: Cat8) {
        println("Enjoy with my ${cat.name}.")
    }
}

fun main() {
    val master = Master1()
    val dog = Dog1("Toto", "Small")
    val cat = Cat8("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}
/*
실행결과 :
Enjoy with my Toto.
Enjoy with my Coco.
 */