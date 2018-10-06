fun main(args: Array<String>) {
    val train = "北京" to "上海"
    println("train二元组的第一个元素是${train.first},第二个元素是${train.second}")

    val str = "法国" + "上海"
    println("str的内容为$str")

    val pair = "日本".到("美国")
    println("pair的内容为$pair")
}

infix fun String.到(other:String):String{
    return this + other
}