package com.example.test.ch3

//다른 패키지에 있는 메소드 임포트해서 쓰기
import com.example.test.cp.User
import com.example.test.cp.data
import com.example.test.cp.formatDate
import java.util.*

fun main() {
    data = 20
    var saydate = formatDate(Date())
    println(saydate)
    User().sayHello()
}