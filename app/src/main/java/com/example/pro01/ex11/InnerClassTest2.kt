package com.example.pro01.ex11
//메서드에 지역 클래스 추가하기
class Smartphone2(val model: String) {
    private val cpu = "Exynos" //인스턴스 멤버

    //inner클래스는 인스턴스 취급
    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" //바깥 클래스의 프로퍼티 접근 가능
    }

    fun powerOn(): String {
        class Led(val color: String) { //지역 클래스 선언
            fun blink(): String = "Blinking $color on $model" //외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") //여기에서 지역 클래스가 사용됨
        return powerStatus.blink()
    } //powerOn() 블록 끝
}

fun main() {
    val mySdcard = Smartphone2("S7"). ExternalStorage(32)
    println(mySdcard.getInfo()) //S7: Installed on Exynos with 32Gb

    val myphone = Smartphone2("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}
/*
출력결과:
S7: Installed on Exynos with 32Gb
Blinking Red on Note9
 */