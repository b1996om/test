package com.example.pro01.ex06
//컴패니언 객체 사용하기
class Person3 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var lang: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person3.lang) //인스턴스를 생성하지 않고 기본값 사용
    Person3.lang = "English" //기본값 변경 가능
    println(Person3.lang) //변경된 내용 출력
    Person3.work() //메서드 실행
    //println(Person3.name) //name은 companion object가 아니므로 에러
}