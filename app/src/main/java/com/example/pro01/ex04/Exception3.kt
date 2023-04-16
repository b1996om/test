package com.example.pro01.ex04
//사용자 예외 정의
//class[사용자 예외 클래스명](message: String) : Exception(message)

class InvalidNameException(message: String) : Exception(message) //사용자 예외 클래스

fun main() {
    var name = "kildong123" //숫자가 포함된 이름

    try {
        validateName(name)
    } catch (e: InvalidNameException) { //숫자가 포함된 예외처리
        println(e.message)
    } catch (e: Exception) { //기타 예외처리
        println(e.message)
    }
}

fun validateName(name: String) {
    if(name.matches(Regex(".*\\d+.*"))) { //이름에 숫자가 포함되어 있으면 예외 던지기
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}