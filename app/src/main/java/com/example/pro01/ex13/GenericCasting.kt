package com.example.pro01.ex13
//제네릭 클래스의 자료형 변환하기
open class Parent  //open을 붙이면 다른 클래스가 상속받을 수 있다.
class Child: Parent() //Parent클래스를 상속받음
class Cup<T>
fun main() {
    val obj1: Parent = Child() //Parent 형식의 obj1은 Child로 형변환 가능

    //val obj2: Child = Parent()
    //val obj3: Cup<Parent> = Cup<Child>()
    //val obj4: Cup<Child> = Cup<Parent>()

    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5
}