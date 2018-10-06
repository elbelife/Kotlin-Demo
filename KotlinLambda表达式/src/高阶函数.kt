fun main(args: Array<String>) {
    val cc = arrayOf(5,4,3)
    val dd = cc.filter { it > 3 }
    println(dd)
    println(dd[0])
    println(dd[1])

    //顶层函数引用
    val aa = arrayOf(5,4,3)
    val rr = aa.filter { isEvent(it) }
    val tt = aa.filter(::isEvent)
    println(rr)
    println(tt)

    //成员函数和扩展函数的引用
    val min = compareTwoValue(-1,5){a,b -> Math.min(a,b)}
    val minOther = compareTwoValue(-2,5,Math::min)
    println(min)
    println(minOther)

    val allOddNumbers = arrayOf(5,4,3).filter (Int::isOdd )
    println(allOddNumbers)

    val p = arrayOf("cool","kotlin","java")
    val x = p.filter ("kotlin"::equals )
    println(x)
}

fun isEvent(a:Int) = a % 2 == 0

fun compareTwoValue(x:Int,y:Int,method:(a:Int,b:Int) -> Int):Int{
    return method(x,y)
}

fun Int.isOdd() = this % 1 == 0