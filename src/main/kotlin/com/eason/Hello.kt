package com.eason

fun main() {

}
fun main(args: Array<String>) {
//    println("Hello kotlin")
    Human().hello()
    val h = Human()
    h.hello()
}
class Human {
    fun hello(){
        println("Hello kotlin")
    }
}