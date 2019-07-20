package com.eason

fun main() {

}
fun main(args: Array<String>) {
//    println("Hello kotlin")
    Human().hello()
    val h = Human()
    h.hello()
    //val給值後不可改變var可以
    val age : Int = 19    //沒有特別指定資料型態，若要指定資料型態可在變數後面加上 :資料型態
    var weight = 77.3
    var weight2 = 44.3f   //轉成float
    val name = "Eason"
    var name2 : String
    name2 = "Eason"

}
class Human {
    fun hello(){
        println("Hello kotlin")
    }
}