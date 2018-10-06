package demo2

fun main(args: Array<String>) {
    val ourself = Oueself("小明")
    println("未被委托的属性${ourself.myNameSX}")
    println(ourself.weiTuoSX)
    ourself.weiTuoSX = "星耀王者"
    println(ourself.weiTuoSX)
}