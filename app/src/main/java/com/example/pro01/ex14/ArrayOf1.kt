package com.example.pro01.ex14
//배열요소에 접근
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println(arr.get(2)) //게터를 통한 접근
    println(arr[2]) //연산자 오버로딩으로 대관호를 통한 접근

    val arr2d = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(arr2d[2][1])
    arr.set(2, 7) //인덱스 2번 요소를 값 7로 교체
    arr[0] = 8 //인덱스 0번 요소를 값 8로 교체
    arr2d[2][1] = 2 //다차원 배열의 요소를 교체
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}, arr2d[2][1]: ${arr2d[2][1]}")
}