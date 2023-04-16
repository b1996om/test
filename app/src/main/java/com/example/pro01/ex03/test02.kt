package com.example.pro01.ex03

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'a'
        in 80.0..89.9 -> grade = 'b'
        in 70.0..79.9 -> grade = 'c'
        in 60.0..69.9 -> grade = 'd'
        in 50.0..59.9 -> grade = 'e'
        !in 50.0..100.0 -> grade = 'f'
    }
    println("Score: $score, Grade: $grade")
}