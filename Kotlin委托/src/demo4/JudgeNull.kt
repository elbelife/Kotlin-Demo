package demo4

import kotlin.properties.Delegates

class JudgeNull {

    var name:String by Delegates.notNull<String>()
}

fun main(args: Array<String>) {
    val judgeNull = JudgeNull()
    judgeNull.name = ""
    println(judgeNull.name)
    judgeNull.name = "小明"
    println(judgeNull.name)
}