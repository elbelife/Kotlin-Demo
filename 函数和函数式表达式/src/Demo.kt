fun main(args: Array<String>) {
    println(add(4,5))

    val i = {x:Int,y:Int -> x+y}
    println(i(3,5))

    val j:(Int,Int)->Int = {x,y -> x+y}
    println(j(5,5))
}

//fun add(a:Int,b:Int):Int{
//    return a+b
//}

//如果函数的方法体就一行代码，并且有返回值，就等同于以下写法
fun add(a:Int,b:Int):Int = a+b