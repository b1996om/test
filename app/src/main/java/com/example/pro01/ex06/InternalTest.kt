package com.example.pro01.ex06

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1 //접근 허용
        println(i)
    }

    fun access() {
        icFunc() //접근 허용
    }
}

class Other {
    internal val ic = InternalClass() //프로퍼티 지정시 internal로 맞춰야 한다.
    fun test() {
        println(ic.i) //접근 허용
        println(ic.icFunc()) //접근허용
    }
}
fun main() {
    val mic = InternalClass() //생성 가능
        mic.i //접근허용
        mic.icFunc() //접근허용
    val other = Other()
        other.test()
}