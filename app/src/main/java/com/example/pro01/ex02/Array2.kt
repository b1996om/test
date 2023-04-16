package com.example.pro01.ex02

//배열 선언과 동시에 값 할당
fun main() {
    val data1 = arrayOf<Int>(10 ,20 ,30) //크기가 3인 Int형 배열을 선언하고 10,20,30으로 할당

    println(
        """
            array size:${data1.size}
            array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """
    )
}