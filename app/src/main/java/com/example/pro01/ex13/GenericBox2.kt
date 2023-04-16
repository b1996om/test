package com.example.pro01.ex13
//제네릭의 형식 매개변수는 기본적으로 null 가능한 형태로 선언
class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main(args: Array<String>) {
    val obj = GenericNull<String>() //non-null로 선언
    obj.EqualityFunc("Hello", "World") //null이 허용되지 않음
    
    val obj2 = GenericNull<Int?>() //null이 가능한 형식으로 선언
    obj2.EqualityFunc(null, 10) //null 사용
}
/*
출력결과:
false
null
 */