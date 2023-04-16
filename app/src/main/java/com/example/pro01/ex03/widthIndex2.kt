package com.example.pro01.ex03
//인덱스와 실제 데이터를 함께 가져오려면 withIndex()함수 이용

//인덱스와 데이터를 가져오는 withIndex()함수
fun main() {
    var data = arrayOf<Int>(10,20,30)
    for((index, value) in data.withIndex()) {
        print(value)
        if(index !== data.size -1) print(",")
    }
}