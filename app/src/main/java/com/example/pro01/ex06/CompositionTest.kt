package com.example.pro01.ex06
//구성관계나타내기
class Car1(val name: String, val power: String) {
    
    private var engine = Engine(power) //Engine 클래스 객체는 Car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    val car = Car1("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}