package com.example.pro01.ex08
//"추상 클래스"
//abstract 키워드와 함께 선언하며 추상클래스는 객체생성이 안된다.
//구체적이지 않은 것을 나타내기 때문에 하위 파생 클래스에서 구체적으로 구현한다.
//open 키워드를 사용하지 않고도 파생 클래스 작성이 가능하다.
abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    abstract var maxSpeed: Double
    var year = "2018"
    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("Name: $name, Color: $color, weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
        override  fun start() {
            println("Car Started")
        }

        override fun stop() {
        println("Car Stopped")
        }
    }

class Motocyle(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
        override fun start() {
            println("Bike Started")
        }

        override fun stop() {
        println("Bike Stopped")
        }
    }

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motocyle("DreamBike", "red", 173.0, 100.0)

    car.year = "2022"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()

}