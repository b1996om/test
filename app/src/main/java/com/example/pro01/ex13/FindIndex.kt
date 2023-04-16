package com.example.pro01.ex13
//제네릭형은 메서드와 클래스에서 사용이 가능하다.
//자료형 결정은 함수가 호출될 때 컴파일러가 자료형을 확정한다.
fun <T> find(a: Array<T>, Target: T): Int {
    for(i in a.indices) {  //indices는 인덱스의 복수형
        if (a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}") //indices는 배열의 유효범위 반환 : arr.indices 0..3
    println(find<String>(arr1, "Cherry")) //요소 c의 인덱스 찾아내기: 2
    println(find(arr2, 2)) //요소 2의 인덱스 찾아내기 : 1
}