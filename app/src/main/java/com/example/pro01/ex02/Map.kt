package com.example.pro01.ex02

fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size}
            mat data : ${map.get("one")}, ${map.get("two")}
        """
    )
}