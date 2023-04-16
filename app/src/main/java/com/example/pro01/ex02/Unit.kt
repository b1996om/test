package com.example.pro01.ex01
//Unit형 : 기본형, 자바의 void형과 같이 return값이 없다.

/*
fun printSum(a: Int, b: Int):Unit {
    println("sum of $a and $b is ${a+b}")
}
 */

fun printSum(a: Int, b: Int) {  // :Unit형 생략가능하다
    println("sum of $a and $b is ${a+b}")
}