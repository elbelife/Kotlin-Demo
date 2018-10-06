fun main(args: Array<String>) {
    println(获取长方形的面积1(3.0,5.0))
    println(获取长方形的面积2(3.0f,5.0f))
    println(获取圆的周长(半径 = 5.0))
    println(获取圆的周长(3.45,5.0))
    println(获取三角形总边长(one = 8,three = 10))
}

val pi = 3.141592657

fun 获取长方形的面积1(长:Double,宽:Double):Double{
    return 长*宽
}

fun 获取长方形的面积2(长:Float,宽:Float):Float{
    return 长*宽
}

fun 获取圆的周长(PI:Double = pi,半径:Double):Double{
    return  2*PI*半径
}

fun 获取三角形总边长(one:Int = 5,two:Int = 7,three:Int):Int{
    return one + two + three
}