fun main(args: Array<String>) {
    val sum = { x:Int, y:Int -> x + y}
    val result = comboTwoValue(3,4,sum)
    val result1 = comboTwoValue(5,sum,8)
    val result2 = comboTwoValue(1,1){x , y -> x + y}
    val result3 = comboTwoValue(1,{x , y -> x + y},1)
    println("result== $result")
    println("result== $result1")
    println("result== $result2")
    println("result== $result3")
}

fun add(x:Int,y:Int):Int{
    return x + y
}

fun comboTwoValue(x:Int,y:Int,method:(a:Int,b:Int) -> Int):Int{
      return method(x,y)
}

fun comboTwoValue(x:Int,method:(a:Int,b:Int) -> Int,y:Int):Int{
    return method(x,y)
}