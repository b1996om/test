package com.example.pro01.ex11
//이너 클래스(inner class)의 바깥 클래스의 멤버 접근
/*
이너 클래스 : inner 키워드 사용해서 내부 클래스 선언.
이너 클래스는 바깥 클래스의 멤버들에 접근 가능.
바깥 클래스의 private멤버도 접근이 가능.
 */
class Smartphone(val model: String) {
    private val cpu = "Exynos" //인스턴스 멤버

    //inner클래스는 인스턴스 취급
    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" //바깥 클래스의 프로퍼티 접근 가능
    }
}

fun main() {
    val mySdcard = Smartphone("S7"). ExternalStorage(32)
    println(mySdcard.getInfo()) //S7: Installed on Exynos with 32Gb
}