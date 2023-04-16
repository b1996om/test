package com.example.pro01.ex03

//인자를 사용하는 when문(cont.)

//일치되는 여러조건
/*
when(x) {
0, 1 -> print("x == 0 or x ==1")
else -> print("기타")
}
 */

//함수의 반환값 사용하기
/*
when(x) {
parseInt(s) -> print("일치함!")
else -> print("기타")
}
 */

//in연산자와 범위 지정자 사용
/*
when(x) {
in 1..10 -> print("x는 1이상 10이하입니다.")
!in 1-..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
else -> print("x는 어떤 범위에도 없습니다.")
}
 */

//is 키워드 함께 사용하기
/*
val str = "안녕하세요."
val result = when(str) {
 is String -> "문자열입니다."
 else -> false
}
 */