package com.example.pro01.ex14
//다차원 배열
fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)
    val array3 = arrayOf(7, 8, 9)
    val arr2d = arrayOf(array1, array2, array3)
    for(e1 in arr2d) {
        for(e2 in e1) {
            print(e2)
        }
        println()
    }

    val arr3d = arrayOf(arrayOf(9, 8, 7), arrayOf(6, 5, 4), arrayOf(3, 2, 1))
    for (e1 in arr3d) {
        for (e2 in e1) {
            print(e2)
        }
        println()
    }
}