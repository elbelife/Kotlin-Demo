fun main(args: Array<String>) {
   var result = sum(1.0,3.5,2.333)
    println(result)

    val a = doubleArrayOf(1.0,3.6,89.5)
    result = sum(*a)
    println(result)
}

fun sum(vararg x:Double):Double{
    var result:Double = 0.0

    for(i in x){
        result += i
    }

    return result
}