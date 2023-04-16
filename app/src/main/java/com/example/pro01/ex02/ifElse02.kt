package com.example.pro01.ex02
//else if는 필요한 만큼 조합할 수 있다.
fun  ifElse02 () {
    val number = 0
    val result = if(number > 0)
        "양수 값"
    else if(number < 0)
        "음수 값"
    else
        "0"
}