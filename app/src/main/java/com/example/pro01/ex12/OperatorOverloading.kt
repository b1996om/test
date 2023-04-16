package com.example.pro01.ex12
//연산자 오버로딩 : 코틀린에서는 특정 연산자의 역할을 함수로 정의. operator 키워드를 사용해 정의한다.
/*
[연산자의 작동 방식]
<a+b>연산자 관련 메서드:
val a = 5
val b = 10
print(a.plus(b)) //print(a+b)와 동일하다.
 */

class Point(var x: Int = 0, var y: Int = 10) {
    //plus 함수의 연산자 오버로딩
    operator fun plus(p: Point) : Point { //operator 키워드 사용
        return Point(x + p.x, y + p.y)
    }
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2  //Point 객체의 + 연산이 가능하게 됨
    println("point = (${point.x}, ${point.y})")
}