package com.example.pro01.ex02
//가변 리스트 사용 예
fun main() {
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)

    """
        list size : ${mutableList.size}
        list data : ${mutableList[0]}, ${mutableList.get(1)},
                    ${mutableList.get(2)}, ${mutableList.get(3)}
        
    """
}