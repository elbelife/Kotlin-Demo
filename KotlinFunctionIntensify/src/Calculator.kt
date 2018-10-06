fun main(args:Array<String>):Unit{

    var a = 8
    var b = 8

    println("a+b="+plus(a,b))
    println("a-b="+sub(a,b))
    println("a*b="+multi(a,b))
    println("a/b="+division(a,b))
}

fun plus(a:Int,b:Int):Int{
    return a+b
}

fun sub(a:Int,b:Int):Int{
    return a-b
}

fun multi(a:Int,b:Int):Int{
    return a*b
}

fun division(a:Int,b:Int):Int{
    return a/b
}