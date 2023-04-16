package com.example.pro01.ex06
//커스텀 게터와 세터 사용하기
class User1(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }

    var age: Int = _age
}

fun main() {
    val user1 = User1(1, "kildong", 35)
    user1.name = "coco"
    println("user3.name = ${user1.name}") //The name was changed
                                          // user3.name = COCO
}
