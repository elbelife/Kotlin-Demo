fun main(args: Array<String>) {
    println(outputString("AAA","BBB",null))
}

fun <T> outputString(a:T,b:T,c:T):String{
    return "$a,$b,$c"
}