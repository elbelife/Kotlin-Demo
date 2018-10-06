//kotlin中对于null的处理
fun main(args: Array<String>) {
    println(heat("饮水机"))
    println(heat(null))

}

//接受一个非null的String类型的参数，加上问号代表参数可以为null
fun heat(str:String?):String{
    return """${str}温度过热"""
}