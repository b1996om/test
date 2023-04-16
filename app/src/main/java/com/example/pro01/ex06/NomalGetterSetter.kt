package com.example.pro01.ex06
//기본 게터와 세터 지정
//"field"라는 명칭은 바꾸면 안된다.("value"는 명칭을 다르게 해도 됨)
class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
    fun main() {
        val user1 = User(1, "Kildong", 30)
        //user.id = 2 //에러! val프로퍼티는 값 변경 불가
        user1.age = 35  //세터동작
        println("user1.age = ${user1.age}") //게터동작  -> user1.age = 35
    }

/*
value : 세터의 매개변수로, 외부로부터 값을 가져옴
       - 외부의 값을 받을 변수가 되므로 value 대신에 어떤 이름이든지 상관 없음
field: 프로퍼티를 참조하는 변수로 보조 필드(backing field)로 불림
       - 프로퍼티를 대신할 임시 필드로, 만일 프로퍼티를 직접 사용하면 게터나 세터가 무한 초훌되는 재귀에 빠짐
 */