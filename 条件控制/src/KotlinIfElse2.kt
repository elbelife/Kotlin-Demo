fun main(args: Array<String>) {

    val a = 5
    val b = 8
    println("${a}和${b}中较大的数是${returnBigger(a,b)}")
}

fun returnBigger(a:Int,b:Int):Int{
    return if(a>b) a else b
}