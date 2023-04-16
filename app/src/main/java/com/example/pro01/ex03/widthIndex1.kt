package com.example.pro01.ex03
//인덱스와 실제 데이터를 함께 가져오려면 withIndex()함수 이용

//반복조건에 컬렉션 타입 활용
fun main() {
    var data = arrayOf<Int>(10,20,30)
    for( i in data.indices) {
        print(data[i])
        if(i !== data.size -1) print(",")
    }
}