package com.example.pro01.ex11
//익명(Anonymous) 객체 : 코틀린에서는 object 키워드를 사용한다.
interface Switcher { //인터페이스 선언
    fun on(): String
}

class Smartphone3(val model: String) {
    private val cpu = "Exynos"
    
    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" //바깥 클래스의 프로퍼티 접근 가능
    }

    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher { //익명 객체를 사용해 Swticher의 on()을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        } //익명(object)객체 블록의 끝
        return powerSwitch.on() //익명 객체의 메서드 사용
    }
}

fun main() {
    val output = Smartphone3("x7")
    val sol = output.powerOn()
    println("$sol")
}