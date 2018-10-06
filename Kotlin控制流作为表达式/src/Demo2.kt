fun main(args: Array<String>) {
    checkNumber(1)
    println(checkMinOrMax(Int.MAX_VALUE))
    println(checkMinOrMaxSimple1(Int.MIN_VALUE))
    println(checkMinOrMaxSimple2(Int.MIN_VALUE))
    println(checkMinOrMaxSimple3(0))
    println(isPositive(- 6))
    println(是单个数字(8))
    println(是竞猜数字(8))
    println(前缀是kotlin("Kotlin牛逼"))
    println(前缀是kotlin(1))
    println(无参的when(50))
}

fun checkNumber(x:Int){
    when(x){
        0 -> println("x的值为0")
        1 -> println("x的值为1")
        else -> println("x不是0也不是1")
    }
}

fun checkMinOrMax(x:Int):Boolean{
    val isMinOrMax = when(x){
        Int.MAX_VALUE -> true
        Int.MIN_VALUE -> true
        else -> false
    }
    return isMinOrMax
}
fun checkMinOrMaxSimple2(x:Int):Boolean{
    val isMinOrMax = when(x){
        Int.MAX_VALUE,Int.MIN_VALUE -> true
        else -> false
    }
    return isMinOrMax
}
fun checkMinOrMaxSimple3(x:Int):Boolean{
    return when(x){
        Int.MAX_VALUE,Int.MIN_VALUE -> true
        else -> false
    }
}


fun checkMinOrMaxSimple1(x:Int) = when(x){
    Int.MAX_VALUE -> true
    Int.MIN_VALUE -> true
    else -> false
}

fun isPositive(x:Int) = when(x) {
        Math.abs(x) -> true
        else -> false
}

fun 是单个数字(x:Int) = when(x){
    in -9 .. 9 -> true
    else -> false
}

fun 是竞猜数字(x:Int) = when(x){
    in arrayOf(1,2,3,4,5,6) -> true
    else -> false
}

fun 前缀是kotlin(any:Any) = when(any){
    is String -> any.startsWith("kotlin",true)
    else -> false
}

fun 无参的when(x:Int):Boolean{
    return when{
        x > 50 -> true
        x < 50 -> false
        else -> false
    }
}


